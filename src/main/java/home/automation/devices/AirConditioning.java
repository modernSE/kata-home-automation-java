package home.automation.devices;

import home.automation.interfaces.SmartHomeDevice;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class AirConditioning implements SmartHomeDevice {

	private int temperatureInCelsius;

	public void setTemperatureInCelsius(int temperatureInCelsius) {
		System.out.println("Setting temperature to " + temperatureInCelsius);
		this.temperatureInCelsius = temperatureInCelsius;
	}

	@Override
	public void turnOff() {
		System.out.println("Turning off airconditioning.");
	}

	@Override
	public void setDefaultScene() {
		setTemperatureInCelsius(20);
	}
}
