package home.automation;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class Shutter implements HomeAutomationElement{

	private void close() {
		System.out.println("Closing blinds.");

	}

	private void open() {
		System.out.println("Opening blinds. Avert your eyes.");
	}

	@Override
	public void startUp() {
		close();
	}

	@Override
	public void shutDown() {
		open();
	}
}
