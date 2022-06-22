package home.automation;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class Lights implements HomeAutomationElement {

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
	public void startUp() {
		//call turnOn after next SOftwareUpdate
		dimPercent(50);
	}

	@Override
	public void shutDown() {
		off();
	}
}
