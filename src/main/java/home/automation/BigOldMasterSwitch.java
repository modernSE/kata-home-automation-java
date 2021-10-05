package home.automation;

import java.util.Map;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class BigOldMasterSwitch extends Switch {

	// single resp.
	// open-closed
	// dependency inversion

	public BigOldMasterSwitch(final Map<Class, Device> devices) {
		super(devices);
	}

	@Override
	public void press() {
		if (!isOn) {
			System.out.println("BIG OLD SWITCH PRESSED.\n\n");
			get(Shutter.class).close();
			get(AirConditioning.class).setTemperatureInCelsius(20);
			get(Lights.class).dimPercent(50);
			get(Stereo.class).play("Bob Marley");
			get(CoffeeMaker.class).brew(CoffeeMaker.Type.DECAF);
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
		} else if (isOn) {
			get(Shutter.class).open();
			get(AirConditioning.class).turnOff();
			get(Lights.class).off();
			get(Stereo.class).rememberPosition();
			get(Stereo.class).off();
			if (get(CoffeeMaker.class).isOn()) {
				get(CoffeeMaker.class).doClean();
				get(CoffeeMaker.class).shutDown();
			}
		}
	}
}
