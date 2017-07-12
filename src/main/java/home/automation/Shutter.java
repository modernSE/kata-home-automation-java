package home.automation;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class Shutter implements IAutomationDevice {

	private boolean isOn;

	@Override
	public boolean isOn() {
		return isOn;
	}

	@Override
	public void turnOff() {
		System.out.println("Opening blinds. Avert your eyes.");
		isOn = false;
	}

	@Override
	public void turnOn() {
		System.out.println("Closing blinds.");
		isOn = true;
	}
}
