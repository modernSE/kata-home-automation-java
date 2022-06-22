package home.automation;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class AirConditioning implements HomeAutomationElement {

	private int temperatureInCelsius;

	public AirConditioning(int startUpTemperature) {
		this.temperatureInCelsius = startUpTemperature;
	}

	public void setTemperatureInCelsius(int temperatureInCelsius) {
		System.out.println("Setting temperature to " + temperatureInCelsius);
		this.temperatureInCelsius = temperatureInCelsius;
	}

	private void turnOff() {
		System.out.println("Turning off airconditioning.");
	}

	@Override
	public void startUp() {
		setTemperatureInCelsius(temperatureInCelsius);
	}

	@Override
	public void shutDown() {
		turnOff();
	}
}
