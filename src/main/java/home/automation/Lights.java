package home.automation;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class Lights implements Device {

	/**
	 * NOTE: starting from the next Software update, dimPercent will not work if the turnOn() method has not been called
	 * before.
	 **/
	public void dimPercent(int i) {
		System.out.println("Dimming to " + i + "%");
	}

	public void off() {
		System.out.println("Lights will go out in 10 seconds.");
	}
}
