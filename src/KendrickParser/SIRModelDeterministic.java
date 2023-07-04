package KendrickParser;

public class SIRModelDeterministic extends OrdinaryDifferentialEquations {
    // Déclaration des paramètres du modèle
    private double transmissionRate; // Taux de transmission
    private double recoveryRate; // Taux de guérison
    private double population; // Taille de la population initiale

    // Constructeur du modèle
    public SIRModelDeterministic(double transmissionRate, double recoveryRate, double population) {
        this.transmissionRate = transmissionRate;
        this.recoveryRate = recoveryRate;
        this.population = population;
    }

    // Implémentation de la méthode equations pour les équations différentielles
    public double[] equations(double[] values) {
        double susceptible = values[0];
        double infected = values[1];
        double recovered = values[2];

        double dS = -transmissionRate * susceptible * infected / population;
        double dI = transmissionRate * susceptible * infected / population - recoveryRate * infected;
        double dR = recoveryRate * infected;

        return new double[] { dS, dI, dR };
    }

    // Méthode principale pour exécuter la simulation
    public void simulate(double initialSusceptible, double initialInfected, double initialRecovered,
                         double startTime, double endTime, double stepSize) {
        // Définition des conditions initiales
        double[] initialValues = { initialSusceptible, initialInfected, initialRecovered };

        // Création de l'objet RungeKuttaAlgorithm
        Algorithm algorithm = new RungeKuttaAlgorithm();

        // Exécution de la simulation
        algorithm.solve(initialValues, startTime, endTime, stepSize);
    }

    // Méthode main pour tester le modèle
    public static void main(String[] args) {
        // Création d'une instance du modèle SIR
        SIRModelDeterministic model = new SIRModelDeterministic(0.5, 0.2, 1000);

        // Simulation du modèle SIR
        model.simulate(990, 10, 0, 0, 50, 0.1);
    }
}



