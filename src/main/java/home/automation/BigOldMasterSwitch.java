package home.automation;

import java.util.List;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class BigOldMasterSwitch implements Switch {

	private boolean isOn;

	List<Component> devices;

	public BigOldMasterSwitch(boolean isOn, List<Component> devices) {
		this.isOn = isOn;
		this.devices = devices;
	}

	public void press() {
		if (!isOn) {
			System.out.println("BIG OLD SWITCH PRESSED.\n\n");
			devices.forEach(device -> device.whenOff());
			isOn = true;
			System.out.println(getLightBulb());
		} else if (isOn) {
			devices.forEach(device -> device.whenOn());
		}
	}

	private String getLightBulb() {
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
		return b.toString();
	}
}
