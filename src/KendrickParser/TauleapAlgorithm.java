package KendrickParser;

import java.util.Random;


public abstract class TauleapAlgorithm implements Algorithm {


	    // Fonction à résoudre
	    public static double f(double x, double y) {
	        return x + y;
	    }

	    // Algorithme de Tau-Leap
	    public static double[] tauLeap(double x0, double y0, double xn, int n, double tau) {
	        double[] y = new double[n + 1];
	        double[] x = new double[n + 1];
	        y[0] = y0;
	        x[0] = x0;
	        Random random = new Random();
	        for (int i = 0; i < n; i++) {
	            double a = f(x[i], y[i]);
	            double b = f(x[i], y[i] + 1);
	            double c = f(x[i] + 1, y[i]);
	            double d = f(x[i] + 1, y[i] + 1);
	            double lambda = Math.max(Math.max(a, b), Math.max(c, d));
	            double h = tau / lambda;
	            double r1 = random.nextGaussian();
	            double r2 = random.nextGaussian();
	            double dy = Math.sqrt(y[i] * h * lambda) * r1 + 0.5 * y[i] * (Math.exp(h * lambda) - 1) * r2;
	            y[i + 1] = Math.max(0, y[i] + dy);
	            x[i + 1] = x[i] + h;
	        }
	        return y;
	    }

	    // Fonction pour résoudre l'équation différentielle
	    public static void solve(double[] initialValues, double startTime, double endTime, double stepSize, double tau) {
	        double[] y = tauLeap(startTime, initialValues[0], endTime, (int) ((endTime - startTime) / stepSize), tau);
	        for (int i = 0; i < y.length; i++) {
	            System.out.println("y(" + (startTime + i * stepSize) + ") = " + y[i]);
	        }
	    }

	    /*
	    public static void main(String[] args) {
	        double[] initialValues = {1};
	        double startTime = 0;
	        double endTime = 1;
	        double stepSize = 0.1;
	        double tau = 0.01;
	        solve(initialValues, startTime, endTime, stepSize, tau);
	    }
	} */
   
}

