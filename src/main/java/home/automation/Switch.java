package home.automation;

import java.util.List;

import home.automation.device_adapters.DeviceAdapter;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class Switch {

	private boolean isOn = false;

	List<DeviceAdapter> devices;

	public Switch(List<DeviceAdapter> devices) {
		this.devices = devices;
	}

	public void press() {
		if (!isOn) {
			System.out.println("BIG OLD SWITCH PRESSED.\n\n");

			for (DeviceAdapter deviceAdapter : devices) {
				deviceAdapter.activate();
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
			for (DeviceAdapter deviceAdapter : devices) {
				deviceAdapter.deactivate();
			}
		}
	}
}
