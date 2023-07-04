package KendrickParser;

public class SIRExampleDeterministic extends OrdinaryDifferentialEquations {
    private double beta; // taux de transmission
    private double gamma; // taux de guérison

    public SIRExampleDeterministic(double beta, double gamma) {
        this.beta = beta;
        this.gamma = gamma;
    }

    public void modelDeclaration() {
        // Déclaration des paramètres et des variables du modèle
        parameter("beta", beta);
        parameter("gamma", gamma);

        variable("S", 990); // Population initiale de personnes susceptibles
        variable("I", 10); // Population initiale de personnes infectées
        variable("R", 0); // Population initiale de personnes guéries
    }

    public void scenarioDeclaration() {
        // Déclaration du scénario de simulation
        scenario("simulation")
            .from(0)
            .to(100)
            .step(1);
    }

    public void simulationDeclaration() {
        // Déclaration des équations différentielles
        equation("dS/dt = -beta * S * I");
        equation("dI/dt = beta * S * I - gamma * I");
        equation("dR/dt = gamma * I");
    }

    public void visualizationDeclaration() {
        // Déclaration de la visualisation des résultats
      
        plot("S");
        plot("I");
        plot("R");
    }

    public static void main(String[] args) {
        // Création du modèle avec les paramètres
        SIRExampleDeterministic model = new SIRExampleDeterministic(0.2, 0.1);

        // Initialisation du modèle
        model.initialize();

        // Simulation avec l'algorithme de Runge-Kutta
        double[] initialValues = {990, 10, 0};
        double startTime = 0;
        double endTime = 100;
        double stepSize = 1;

     // model.solve(initialValues, startTime, endTime, stepSize);
        // Création de l'objet RungeKuttaAlgorithm
        Algorithm algorithm = new RungeKuttaAlgorithm();
        
     // Exécution de la simulation
        algorithm.solve(initialValues, startTime, endTime, stepSize);
        
       
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
    }
}

