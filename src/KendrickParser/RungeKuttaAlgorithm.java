package KendrickParser;


public class RungeKuttaAlgorithm implements Algorithm {
	

	    // Fonction à résoudre
	    public static double f(double x, double y) {
	        return x + y;
	    }

	    // Algorithme de Runge-Kutta d'ordre 4
	    public static double[] rk4(double x0, double y0, double xn, int n) {
	        double[] y = new double[n + 1];
	        double[] x = new double[n + 1];
	        double h = (xn - x0) / n;
	        y[0] = y0;
	        x[0] = x0;
	        for (int i = 0; i < n; i++) {
	            double k1 = h * f(x[i], y[i]);
	            double k2 = h * f(x[i] + h / 2, y[i] + k1 / 2);
	            double k3 = h * f(x[i] + h / 2, y[i] + k2 / 2);
	            double k4 = h * f(x[i] + h, y[i] + k3);
	            y[i + 1] = y[i] + (k1 + 2 * k2 + 2 * k3 + k4) / 6;
	            x[i + 1] = x[i] + h;
	        }
	        return y;
	    }

	    // Fonction pour résoudre l'équation différentielle
	    public void solve(double[] initialValues, double startTime, double endTime, double stepSize) {
	        double[] y = rk4(startTime, initialValues[0], endTime, (int) ((endTime - startTime) / stepSize));
	        for (int i = 0; i < y.length; i++) {
	            System.out.println("y(" + (startTime + i * stepSize) + ") = " + y[i]);
	        }
	    }

	
   
    
}
