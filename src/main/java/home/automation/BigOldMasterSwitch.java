package home.automation;

import java.util.List;

import home.automation.wrapper.DeviceWrapper;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class BigOldMasterSwitch {

	private boolean isOn = false;

	private List<DeviceWrapper> devices;

	public BigOldMasterSwitch(List<DeviceWrapper> devices) {
		this.devices = devices;
	}
	
	// Single Responsibility verletzt
	public void press() {
	
		if (!isOn) {
			executeActions();
			isOn = true;
		}
		else {
			shutDevicesDown();
			isOn = false;
		}
	}

	private void executeActions() {
		// toDo change name
		System.out.println("BIG OLD SWITCH PRESSED.\n\n");
		devices.forEach(device -> device.startWithDefaultAction());
	
		printLightBulb();
	}

	private void shutDevicesDown() {
		devices.forEach(device -> device.shutDown());
	}
	
	private void printLightBulb() {
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
