package home.automation;

import java.util.Map;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class Main {

	public static void main(String[] args) {
		Map<Class, Device> devices = Map.of(
			Stereo.class, new Stereo(),
			AirConditioning.class, new AirConditioning(),
			Lights.class, new Lights(),
			Shutter.class, new Shutter(),
			CoffeeMaker.class, new CoffeeMaker()
		);

		BigOldMasterSwitch s = new BigOldMasterSwitch(devices);
		s.press();
		s.press();

		MotionDetectorSwitch s2 = new MotionDetectorSwitch(Map.of(StaircaseLights.class, new StaircaseLights()));
		s2.press();
	}

}
