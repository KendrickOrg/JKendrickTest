package KendrickParser;

import java.util.Random;

public abstract class GillespieAlgorithm implements Algorithm {

	   // Fonction à résoudre
    public static double[] f(double[] x, double t) {
        double[] fx = new double[x.length];
        fx[0] = -0.01 * x[0] + 0.02 * x[1];
        fx[1] = 0.01 * x[0] - 0.02 * x[1];
        return fx;
    }

    // Algorithme de la méthode directe de Gillespie
    public static double[] gillespie(double[] x0, double t0, double t1) {
        double[] x = new double[x0.length];
        double t = t0;
        for (int i = 0; i < x.length; i++) {
            x[i] = x0[i];
        }
        Random random = new Random();
        while (t < t1) {
            double[] fx = f(x, t);
            double a = fx[0] + fx[1];
            double r1 = random.nextDouble();
            double r2 = random.nextDouble();
            double tau = (1 / a) * Math.log(1 / r1);
            int j = (r2 * a <= fx[0]) ? 0 : 1;
            x[j] += 1;
            t += tau;
        }
        return x;
    }

    // Fonction pour résoudre l'équation différentielle
    public static void solve(double[] initialValues, double startTime, double endTime) {
        double[] x = gillespie(initialValues, startTime, endTime);
        System.out.println("x(" + startTime + ") = " + x[0]);
        System.out.println("y(" + startTime + ") = " + x[1]);
    }

	

    /* Fonction principale
    public static void main(String[] args) {
        double[] initialValues = {100, 0};
        double startTime = 0;
        double endTime = 10;
        solve(initialValues, startTime, endTime);
    } */

}
