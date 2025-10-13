package home.automation.devices;

import home.automation.interfaces.SmartHomeDevice;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class Lights implements SmartHomeDevice {

	/**
	 * NOTE: starting from the next Software update, dimPercent will not work if the turnOn() method has not been called
	 * before.
	 **/
	public void dimPercent(int i) {
		System.out.println("Dimming to " + i + "%");
	}

	@Override
	public void turnOff() {
		System.out.println("Lights will go out in 10 seconds.");
	}

	@Override
	public void setDefaultScene() {
		dimPercent(50);
	}
}
