package jKendrick.solvers;


import java.util.List;

import jKendrick.simulation.ISolver;
import jKendrick.simulation.Model;
import jKendrick.simulation.Scenario;
import jKendrick.tools.PoissonGenerator;

public class TauLeap implements ISolver{
	private double step;
	private double[][][] result;
	private int nbCycles;
	private int nbSteps;
	private PoissonGenerator poisson;
	private Scenario scenario;
	private double end;
	
	
	public TauLeap(Model model) {
		this.step=model.getStep();
		this.nbCycles=model.getNbCycles();
		assert nbCycles>0;
		assert step>0;
		this.nbSteps=(int) Math.ceil(model.getEnd()/step);
		this.end=model.getEnd();
		poisson=new PoissonGenerator();
		this.scenario=model.getScenario();
	
		initValues();
		
	}
	
	public void initValues() {
		List<String> population=scenario.getCompartments();
		double result[][][]=new double[nbCycles][nbSteps][scenario.getNbCompartments()];
		for(int i=0;i<nbCycles;++i) {
			for(int j=0;j<population.size();++j) {
				result[i][0][j]=scenario.getParam(population.get(j));	
			}
		}
		this.result=result;
	}
	
	
	
	public double getValue(int cycle, int step, int compartment) {
		return result[cycle][step][compartment];
	}
	
	@Override
	public void solve() {
		scenario.saveInitialParams();
		double rate=0.;
		int nbAction=0;
		for(int i=0;i<nbCycles;++i) {
			scenario.resetParams();
			for(int j=1;j<nbSteps;++j) {
				for(int l=0;l<scenario.getNbCompartments();++l) {
					result[i][j][l]=getValue(i, j-1, l);
				}
				String[][] events=scenario.getTransitions().getPossibleEvents();
				for(int k=0;k<events.length;++k) {
					rate=scenario.getTransitions().getRate(events[k][0],events[k][1],scenario);
					if(rate!=0.) {
						nbAction=poisson.poissonSample((rate)*step);
						for(int m=0;m<nbAction;++m) {
							scenario.transition(events[k][0],events[k][1]);
							result[i][j][scenario.indexOf(events[k][0])]--;
							result[i][j][scenario.indexOf(events[k][1])]++;	
						}
					}
				}
			}
		}
		scenario.resetParams();
	}
	
	//retourne une copie du tableau de resultat
	@Override
		public double[][][] getResult(){
			double r[][][]=new double[nbCycles][nbSteps][scenario.getNbCompartments()];
			for(int i=0;i<nbCycles;++i) {
				for(int j=0;j<nbSteps;++j) {
					for(int k=0;k<scenario.getNbCompartments();++k) {
						r[i][j][k]=result[i][j][k];
					}
				}
			}
			return r;
		}
		
		
		//retourne un tableau qui contient le cycle median
	@Override
		public double[][] getMedianPath(){
			double[][] median=new double[nbSteps][scenario.getNbCompartments()];
			double[][][] r=getResult();
			int cycle=getMedCycle();
			median=r[cycle];
			return median;
		}
		
		//retourne l'index du cycle median
		public int getMedCycle() {
			int min=0;
			double[][][] scores=getAllRanks();
			for(int i=0;i<nbCycles;++i) {
				if(getCycleScore(scores, min)>getCycleScore(scores, i)) {
					min=i;
				}
			}
			return min;
		}
		
		//retourne le score moyen d'un cycle
		public double getCycleScore(double[][][] scores, int cycle) {
			double[] cycleScores=getCycleRanks(scores, cycle);
			double score=0.;
			for(int i=0;i<cycleScores.length;++i) {
				double s=cycleScores[i]-(double)nbCycles/2;
				score+=(s*s);
			}
			score=score/cycleScores.length;
			return score;
		}
		//retourne un tableau avec les classements d'un cycle
		public double[] getCycleRanks(double[][][] scores, int cycle){
			int nbScores=nbSteps*(scenario.getNbCompartments());
			double[] cycleScores=new double[nbScores];
			int k=0;
			for(int i=0;i<nbSteps;++i) {
				for(int j=0;j<scenario.getNbCompartments();++j) {
					cycleScores[k]=scores[i][j][cycle];
				}
			}
			return cycleScores;		
		}
		
		//retourne un tableau avec tous les classements de chaque cycle
		public double[][][] getAllRanks(){
			double[][][] scores=new double[nbSteps][scenario.getNbCompartments()][nbCycles];
			for(int i=0;i<nbSteps;++i) {
				for(int j=0;j<scenario.getNbCompartments();++j) {
					scores[i][j]=getRanks(i, j);
				}
			}
			return scores;
		}
		
		
		//retourne un tableau avec les cycles classés pour une etape et un compartment donnés
		public double[] getRanks(int step, int compartment) {
			double[][][] r=getResult();
			double[] tab=new double[nbCycles];
			for(int i=0;i<nbCycles;++i) {
				tab[i]=r[i][step][compartment];
			}
			double[] sorted=sort(tab)[1];
			double[] ranks=new double[nbCycles];
			for(int i=0;i<nbCycles;++i) {
				for(int j=0;j<nbCycles;++j) {
					if(sorted[j]==i) {
						ranks[i]=j;
					}
				}
			}
			return ranks;
		}
		
		//retourne un tableau avec une colonne index pour conserver l'identification des cycles lors du tri
		public double[][] prepareToSort(double[] t){
			double[][] p=new double[2][t.length];
			for(int i=0;i<t.length;++i) {
				p[0][i]=(double)i;
				p[1][i]=t[i];
			}
			return p;
		}
		
		//tri fusion
		public double[][] sort(double[] tab) {
			double[][] t=prepareToSort(tab);
			if(t.length>0) {
				sort(t,0,t.length-1);
			}
			return t;
		}
		
		//étape de tri fusion
		public void sort(double[][] t, int start, int end) {
			if(start != end) {
				int mid=(start+end)/2;
				sort(t,start,mid);
				sort(t,mid+1,end);
				merge(t,start,mid,end);
			}
		}
		
		//fusion
		public void merge(double[][] t, int start, int mid, int end) {
			int start2=mid+1;
			double[][] tab1=new double[2][mid-start+1];
			for(int i=start; i<=mid;++i) {
				tab1[0][i-start]=t[0][i];
				tab1[1][i-start]=t[1][i];
			}
			int c1=start;
			int c2=start2;
			for(int i=start;i<=end;++i) {
				if(c1==start2) {
					break;
				}
				else if((c2==end+1)||(tab1[1][c1-start]<t[1][c2])) {
					t[0][i]=tab1[0][c1-start];
					t[1][i]=tab1[1][c1-start];
					++c1;
				}
				else {
					t[0][i]=t[0][c2];
					t[1][i]=t[1][c2];
					++c2;
				}
			}
		}

		@Override
		public String[] getLabels() {
			return scenario.getCompartments().toArray(new String[scenario.getNbCompartments()]);
		}

		@Override
		public double getEnd() {
			return end;
		}

		@Override
		public double getStep() {
			return step;
		}
		
		@Override
		public double[] getTimes(int cycle) {
			double[] times=new double[nbSteps];
			times[0]=0;
			for(int i=1;i<times.length;++i) {
				times[i]=times[i-1]+step;
			}
			return times;
		}

		@Override
		public double[] getMedianTimes() {
			return getTimes(1);
		}
		
		@Override
		public int getNbSteps() {
			return nbSteps;
		}
		
	
	

}
