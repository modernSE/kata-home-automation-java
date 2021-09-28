package home.automation;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class Shutter implements Device {

	public void close() {
		System.out.println("Closing blinds.");

	}

	public void open() {
		System.out.println("Opening blinds. Avert your eyes.");
	}
}
