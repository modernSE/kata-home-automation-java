package home.automation.devices;

import home.automation.interfaces.SmartHomeDevice;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class Shutter implements SmartHomeDevice {
	@Override
	public void turnOff() {
		open();
	}

	@Override
	public void setDefaultScene() {
		close();
	}

	public void close() {
		System.out.println("Closing blinds.");

	}

	public void open() {
		System.out.println("Opening blinds. Avert your eyes.");
	}
}
