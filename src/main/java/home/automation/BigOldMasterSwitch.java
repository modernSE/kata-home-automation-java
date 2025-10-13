package home.automation;

import java.util.List;

import home.automation.devices.*;
import home.automation.interfaces.*;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class BigOldMasterSwitch {

	public BigOldMasterSwitch(List<SmartHomeDevice> devices) {
		this.devices = devices;
	}

	private List<SmartHomeDevice> devices;

	private boolean isOn = false;

	private Shutter shutter = new Shutter();

	private AirConditioning airConditioning = new AirConditioning();

	private Lights lights = new Lights();

	private Stereo stereo = new Stereo();

	private CoffeeMaker coffeeMaker = new CoffeeMaker();

	public void press() {
		if (!isOn) {
			reportPress();
			devices.forEach(Scenable::setDefaultScene);
			setOn();
		} else if (isOn) {
			devices.forEach(TurnOffable::turnOff);
		}
	}

	private void setOn() {
		isOn = true;
		StringBuffer b = new StringBuffer();
		b.append("         |\n");
		b.append(" \\     _____     /\n");
		b.append("     /       \\\n");
		b.append("    (         )\n");
		b.append("-   ( ))))))) )   -\n");
		b.append("     \\ \\   / /\n");
		b.append("      \\|___|/\n");
		b.append("  /    |___|    \\\n");
		b.append("       |___| prs\n");
		b.append("       |___|\n");
		System.out.println(b.toString());
	}

	private void reportPress() {
		System.out.println("BIG OLD SWITCH PRESSED.\n\n");
	}
}
