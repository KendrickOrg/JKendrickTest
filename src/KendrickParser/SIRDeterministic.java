package KendrickParser;



public class SIRDeterministic extends OrdinaryDifferentialEquations {
    public int NUM_EQUATIONS = 4; // Nombre total d'équations dans le modèle

    // Constantes du modèle
    private double beta;  // Taux de transmission
    private double gamma; // Taux de guérison
    private double mu;    // Taux de mortalité

    // Constructeur
    public SIRDeterministic(double beta, double gamma, double mu) {
        this.beta = beta;
        this.gamma = gamma;
        this.mu = mu;
    }

    // Méthode pour évaluer les dérivées des équations différentielles
  
	public double[] evaluateDerivatives(double[] values, double t) {
        double[] derivatives = new double[NUM_EQUATIONS]; // Tableau pour stocker les dérivées

        double S = values[0]; // Nombre de personnes saines
        double I = values[1]; // Nombre de personnes infectées
        // Calcul des dérivées pour chaque équation
        derivatives[0] = -beta * S * I;              // Dérivée de S (saines)
        derivatives[1] = beta * S * I - gamma * I;   // Dérivée de I (infectées)
        derivatives[2] = gamma * I;                  // Dérivée de R (guéries)
        derivatives[3] = mu * I;                     // Dérivée de D (décédées)

        return derivatives;
    }

    public static void main(String[] args) {
        // Paramètres du modèle
        double beta = 0.3;
        double gamma = 0.1;
        double mu = 0.01;

        // Conditions initiales
        double[] initialValues = { 1000, 10, 0, 0 }; // [S, I, R, D]

        // Intervalle de temps
        double startTime = 0.0;
        double endTime = 100.0;
        double stepSize = 1.0;

        new SIRDeterministic(beta, gamma, mu);

        // Utilisation de l'algorithme de Runge-Kutta pour la simulation
        RungeKuttaAlgorithm algorithm = new RungeKuttaAlgorithm();
        algorithm.solve(initialValues, startTime, endTime, stepSize);
    }
}



