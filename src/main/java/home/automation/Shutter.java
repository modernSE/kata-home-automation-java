package home.automation;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class Shutter implements ISmartDevice {

	private boolean isOn = false;

	public void close() {
		System.out.println("Closing blinds.");

	}

	public void open() {
		System.out.println("Opening blinds. Avert your eyes.");
	}

	@Override
	public boolean isOn() {
		return isOn;
	}

	@Override
	public void switchState() {
		if (isOn) {
			close();
		} else {
			open();
		}
		isOn = !isOn;
	}

	

}
