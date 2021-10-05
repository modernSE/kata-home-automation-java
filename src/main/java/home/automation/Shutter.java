package home.automation;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class Shutter extends AbstractHomeComponent implements Stoppable {

	@Override
	public void changeState(String i) {
		System.out.println("Closing blinds.");

	}

	@Override
	public void stop() {
		System.out.println("Opening blinds. Avert your eyes.");
	}
}
