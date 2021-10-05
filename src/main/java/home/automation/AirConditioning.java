package home.automation;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class AirConditioning  extends AbstractHomeComponent implements Stoppable {

	private String temperatureInCelsius;

	@Override
	public void changeState(String temperatureInCelsius) {
		this.temperatureInCelsius = temperatureInCelsius;
		System.out.println("Setting temperature to " + this.temperatureInCelsius);
	}

	public void stop() {
		System.out.println("Turning off airconditioning.");
	}
}
