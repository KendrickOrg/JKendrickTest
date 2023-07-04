package KendrickParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;


public class ContinuousTimeMarkovChain {
	private Map<String, Double> parameters;
	private List<String> variables;
	private Map<String, Map<String, Double>> scenarios;
	private List<String> plots;
	private List<String> states;
	private List<String> transitions;
    private List<String> transitionFromStates;
    private List<String> transitionToStates;
    private List<BiFunction<Double, double[], Double>> transitionRates;
    private List<double[]> results;
	
	
	public ContinuousTimeMarkovChain() {
        parameters = new HashMap<>();
        variables = new ArrayList<>();
        scenarios = new HashMap<>();
        plots = new ArrayList<>();
        states = new ArrayList<>();
        transitions = new ArrayList<>();
        transitionFromStates = new ArrayList<>();
        transitionToStates = new ArrayList<>();
        transitionRates = new ArrayList<>();
    }


    public void initialize() {
        // Initialisation des paramètres et des variables du modèle
        parameters.clear();
        variables.clear();
    }

    protected void parameter(String name, double value) {
		parameters.put(name, value);
    }
    
    protected void variable(String name, double initialValue) {
        variables.add(name + "=" + initialValue);
    }
    
    protected ScenarioBuilder scenario(String name) {
        ScenarioBuilder builder = new ScenarioBuilder(name);
        scenarios.put(name, new HashMap<>());
        return builder;
    }

    public class ScenarioBuilder {
        private String name;

        public ScenarioBuilder(String name) {
            this.name = name;
        }

        public ScenarioBuilder from(double startTime) {
            scenarios.get(name).put("startTime", startTime);
            return this;
        }

        public ScenarioBuilder to(double endTime) {
            scenarios.get(name).put("endTime", endTime);
            return this;
        }

        public ScenarioBuilder step(double stepSize) {
            scenarios.get(name).put("stepSize", stepSize);
            return this;
        }
    }
    
    protected void plot(String variable) {
        plots.add(variable);
    }
    
    protected void state(String stateName) {
        states.add(stateName);
    }

    protected void transition(String transitionName, String fromState, String toState, BiFunction<Double, double[], Double> rateFunction) {
        transitions.add(transitionName);
        transitionFromStates.add(fromState);
        transitionToStates.add(toState);
        transitionRates.add(rateFunction);
    }
    
    public double[][] getResults() {
        if (results == null) {
           throw new IllegalStateException("Simulation has not been executed yet.");
        }

        // Convertir la liste de résultats en un tableau 2D
        double[][] resultsArray = new double[results.size()][];
        for (int i = 0; i < results.size(); i++) {
            resultsArray[i] = results.get(i);
        }

        return resultsArray;
    }

    // ...

    @SuppressWarnings("unused")
	private void recordResult(double t, double[] values) {
        double[] result = new double[values.length + 1];
        result[0] = t;
        System.arraycopy(values, 0, result, 1, values.length);
        results.add(result);
    }
    
    
}

