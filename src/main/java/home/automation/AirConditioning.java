package home.automation;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class AirConditioning implements IAutomationDevice {

	private int temperatureInCelsius;
	private boolean isOn;

	private void setTemperatureInCelsius(int temperatureInCelsius) {
		System.out.println("Setting temperature to " + temperatureInCelsius);
		this.temperatureInCelsius = temperatureInCelsius;
	}

	@Override
	public void turnOff() {
		System.out.println("Turning off airconditioning.");
		isOn = false;


	}

	@Override
	public boolean isOn() {
		return isOn;
	}

	@Override
	public void turnOn() {
		setTemperatureInCelsius(20);
		isOn = true;
		
	}
}
