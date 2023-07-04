package KendrickParser;

public class SIRExampleStochastic extends ContinuousTimeMarkovChain {
    private double beta; // taux de transmission
    private double gamma; // taux de guérison

    public SIRExampleStochastic(double beta, double gamma) {
        this.beta = beta;
        this.gamma = gamma;
    }

   // @Override
    public void modelDeclaration() {
        // Déclaration des paramètres et des états du modèle
        parameter("beta", beta);
        parameter("gamma", gamma);

        state("S");
        state("I");
        state("R");
    }

    public void transitionDeclaration() {
        // Déclaration des transitions entre les états du modèle
        transition("S -> I", "S", "I", (t, values) -> beta * values[0] * values[1]);
        transition("I -> R", "I", "R", (t, values) -> gamma * values[1]);
    }

    public static void main(String[] args) {
        // Création du modèle avec les paramètres
        SIRExampleStochastic model = new SIRExampleStochastic(0.2, 0.1);

        // Initialisation du modèle
        model.initialize();

        // Simulation avec l'algorithme de Runge-Kutta
        double[] initialValues = {9, 1, 0};
        double startTime = 0;
        double endTime = 10;
        double stepSize = 0.1;
        double tau = 0.01;
        
        
     // model.solve(initialValues, startTime, endTime, stepSize);
        // Création de l'objet RungeKuttaAlgorithm
       // TauleapAlgorithm algorithm = new TauleapAlgorithm();
        
     // Exécution de la simulation
        TauleapAlgorithm.solve(initialValues, startTime, endTime, stepSize, tau);

        double[][] results = model.getResults();

        // Affichage des résultats
        System.out.println("Time\tS\tI\tR");
        for (int i = 0; i < results.length; i++) {
            double time = results[i][0];
            double S = results[i][1];
            double I = results[i][2];
            double R = results[i][3];
            System.out.println(time + "\t" + S + "\t" + I + "\t" + R);
        }

      

        // Affichage des résultats
    /*    double[][] results = model.getResults();
        System.out.println("Time\tS\tI\tR");
        for (int i = 0; i < results.length; i++) {
            System.out.println(results[i][0] + "\t" + results[i][1] + "\t" + results[i][2] + "\t" + results[i][3]);
        } */
    }
}


