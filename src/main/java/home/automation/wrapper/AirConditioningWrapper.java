package home.automation.wrapper;

import home.automation.airconditioner.AirConditioning;

public class AirConditioningWrapper implements DeviceWrapper{

	AirConditioning airConditioning;
	
	public AirConditioningWrapper() {
		airConditioning = new AirConditioning();
	}
	
	@Override
	public void startWithDefaultAction() {
		airConditioning.setTemperatureInCelsius(20);
	}

	@Override
	public void shutDown() {
		airConditioning.turnOff();
	}

}
