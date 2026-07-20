package home.automation;

import java.util.List;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class Main {

	public static void main(String[] args) {
		List<Component> devices = List.of(
				new ShutterAdapter(new Shutter()),
				new AirConditioningAdapter(new AirConditioning()),
				new LightsAdapter(new Lights()),
				new StereoAdapter(new Stereo()),
				new AnalogRadioPluginAdapter(new AnalogRadioPlugin()),
				new CoffeeMakerAdapter(new CoffeeMaker()));
		BigOldMasterSwitch s = new BigOldMasterSwitch(false, devices);
		s.press();

		s.press();
	}

}
