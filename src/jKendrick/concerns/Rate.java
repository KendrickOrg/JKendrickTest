package jKendrick.concerns;


import jKendrick.scenario.Scenario;


public class Rate implements IRates {
	private String value;
	public Rate(String value) {
		this.value=value;
	}
	
	@Override
	public double getRate(Scenario s) {
		return s.getParam(value);
	}

	

	
	
	
}