package home.automation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import home.automation.wrapper.AirConditioningWrapper;
import home.automation.wrapper.CoffeeMakerWrapper;
import home.automation.wrapper.DeviceWrapper;
import home.automation.wrapper.LightsWrapper;
import home.automation.wrapper.ShutterWrapper;
import home.automation.wrapper.StereoWrapper;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class Main {

	public static void main(String[] args) {
		List<DeviceWrapper> devices = Arrays.asList(new ShutterWrapper(), new AirConditioningWrapper(), new LightsWrapper(), new StereoWrapper(), new CoffeeMakerWrapper());
		
		BigOldMasterSwitch s = new BigOldMasterSwitch(devices);
		s.press();

		s.press();
	}

}
