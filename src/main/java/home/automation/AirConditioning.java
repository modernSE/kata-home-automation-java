package home.automation;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class AirConditioning {

	private int temperatureInCelsius;

	public void setTemperatureInCelsius(int temperatureInCelsius) {
		System.out.println("Setting temperature to " + temperatureInCelsius);
		this.temperatureInCelsius = temperatureInCelsius;
	}

	public void turnOff() {
		System.out.println("Turning off airconditioning.");
	}
}
