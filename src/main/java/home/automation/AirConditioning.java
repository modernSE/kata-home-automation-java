package home.automation;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class AirConditioning implements Device {

	private int temperatureInCelsius;

	public void setTemperatureInCelsius(int temperatureInCelsius) {
		System.out.println("Setting temperature to " + temperatureInCelsius);
		this.temperatureInCelsius = temperatureInCelsius;
	}

	public void turnOff() {
		System.out.println("Turning off airconditioning.");
	}

    @Override
    public void on() {
        setTemperatureInCelsius(20);

    }

    @Override
    public void off() {
        turnOff();

    }
}
