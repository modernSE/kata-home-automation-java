package home.automation;

import java.util.List;

import home.automation.devices.AirConditioning;
import home.automation.devices.CoffeeMaker;
import home.automation.devices.Lights;
import home.automation.devices.Shutter;
import home.automation.devices.Stereo;
import home.automation.interfaces.SmartHomeDevice;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class Main {

	public static void main(String[] args) {
		List<SmartHomeDevice> devices = List.of(new Shutter(), new AirConditioning(), new Lights(), new Stereo(), new CoffeeMaker());
		BigOldMasterSwitch s = new BigOldMasterSwitch(devices);
		s.press();
		s.press();
	}

}
