package home.automation;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class BigOldMasterSwitch {

	private List<Switch> allSwitches = Arrays.asList(new ShutterSwitch(), new AirConditioningSwitch(20), new LightsSwitch(50), new StereoSwitch("Bob Marley"), new CoffeeMakerSwitch(CoffeeMaker.Type.DECAF));

	private boolean isOn = false;
	public void press() {
		if (!isOn) {
			System.out.println("BIG OLD SWITCH PRESSED.\n\n");

			allSwitches.forEach(s -> s.turnOn());

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
			allSwitches.forEach(s -> s.turnOff());
		}
	}
}
