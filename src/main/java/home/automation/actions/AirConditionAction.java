package home.automation.actions;

import home.automation.AirConditioning;

public class AirConditionAction implements AutomationAction {

	private AirConditioning airConditioning;
	
	private int temperatureInCelsius;

	public AirConditionAction(int temperatureInCelsius) {
		this.temperatureInCelsius = temperatureInCelsius;
		airConditioning = new AirConditioning();
	}

	
	@Override
	public void turnOn() {
		airConditioning.setTemperatureInCelsius(temperatureInCelsius);

	}

	@Override
	public void turnOff() {
		airConditioning.turnOff();

	}
}
