package home.automation;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class Lights implements IAutomationDevice {
	
	private boolean isOn;

	/**
	 * NOTE: starting from the next Software update, dimPercent will not work if the turnOn() method has not been called
	 * before.
	 **/
	private void dimPercent(int i) {
		System.out.println("Dimming to " + i + "%");
	}

	private void off() {
		System.out.println("Lights will go out in 10 seconds.");
	}

	@Override
	public boolean isOn() {
		// TODO Auto-generated method stub
		return isOn;
	}

	@Override
	public void turnOn() {
		dimPercent(50);
		isOn = true;
		
	}

	@Override
	public void turnOff() {
		off();
		isOn = false;
		
	}
}
