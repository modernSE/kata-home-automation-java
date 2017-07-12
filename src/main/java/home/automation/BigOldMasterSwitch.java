package home.automation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class BigOldMasterSwitch implements ISwitch {
	
	Set<IAutomationDevice> devices = new HashSet<>();
	
	/*
	 * Factory für die Geräte
	 * set von objekten, die abgearbeitet werden können.
	 * abstraktion von objekten, und von konfigurationen.
	 */

	private boolean isOn = false;


	public void press() {
		if (!isOn) {
			System.out.println("BIG OLD SWITCH PRESSED.\n\n");
			
			for (Iterator iterator = devices.iterator(); iterator.hasNext();) {
				IAutomationDevice iAutomationDevice = (IAutomationDevice) iterator.next();
				iAutomationDevice.turnOn();
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
			for (Iterator iterator = devices.iterator(); iterator.hasNext();) {
				IAutomationDevice iAutomationDevice = (IAutomationDevice) iterator.next();
				iAutomationDevice.turnOff();
			}
		}
	}


	@Override
	public void addDevice(IAutomationDevice device) {
		this.devices.add(device);
	}


	@Override
	public void addDevices(Set<IAutomationDevice> devices) {
		this.devices.addAll(devices);
	}
}
