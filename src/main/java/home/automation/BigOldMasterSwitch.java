package home.automation;

import java.util.List;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class BigOldMasterSwitch {

	private boolean isOn = false;

	private Shutter shutter = new Shutter();

	private AirConditioning airConditioning = new AirConditioning();

	private Lights lights = new Lights();

	private Stereo stereo = new Stereo();

	private CoffeeMaker coffeeMaker = new CoffeeMaker();

	private List<ISmartDevice> deviceList = List.of(new Shutter());



	public void press() {
		if (!isOn) {
		for (ISmartDevice iSmartDevice : deviceList) {
			iSmartDevice.switchState();
		}
		
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
			for (ISmartDevice iSmartDevice : deviceList) {
				iSmartDevice.switchState();
			}
		}
	}
}
