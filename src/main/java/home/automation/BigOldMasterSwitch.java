package home.automation;

import java.util.List;

import home.config;
import home.commands.AbstractSwitch;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class BigOldMasterSwitch {

	private boolean isOn = false;

	public void press() {
		List<AbstractSwitch> switches = new config().getMaster();
		if (!isOn) {
			System.out.println("BIG OLD SWITCH PRESSED.\n\n");
			switches.forEach(sw -> sw.turnOn());
			printLightbulb();
		} else if (isOn) {
			switches.forEach(sw -> sw.turnOff());
		}
	}

	/*
	 * 
	
	
	private void turnEverythingOff() {
		shutter.open();
		airConditioning.turnOff();
		lights.off();
		stereo.rememberPosition();
		stereo.off();
		if (coffeeMaker.isOn()) {
			coffeeMaker.doClean();
			coffeeMaker.shutDown();
		}
	}

	private void turnEverythingOn() {
		System.out.println("BIG OLD SWITCH PRESSED.\n\n");
		shutter.close();
		airConditioning.setTemperatureInCelsius(20);
		lights.dimPercent(50);
		stereo.play("Bob Marley");
		coffeeMaker.brew(CoffeeMaker.Type.DECAF);
		isOn = true;
	}

	 * 
	*/

	private void printLightbulb() {
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
}
