package home.automation;

import home.automation.adapters.AirConditioningAdapter;
import home.automation.adapters.CoffeeMakerAdapter;
import home.automation.adapters.InvertedSwitchableDecorator;
import home.automation.adapters.LightsAdapter;
import home.automation.adapters.ShutterAdapter;
import home.automation.adapters.StereoAdapter;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class Main {

	public static void main(String[] args) {
		final Switchable lights = createLights();
		final Switchable shutter = createShutter();
		final Switchable ac = createAC();
		final Switchable stereo = createStereo();
		final Switchable coffeeMaker = createCoffeeMaker();

		final Switchable vac = new InvertedSwitchableDecorator(new VacuumCleaner());

		BigOldMasterSwitch s = new BigOldMasterSwitch();
		s.register(shutter);
		s.register(ac);
		s.register(lights);
		s.register(stereo);
		s.register(coffeeMaker);
//		s.register(vac);

		s.press();
		s.press();

//		MotionDetector staircaseLightsDetector = new MotionDetector();
//		staircaseLightsDetector.register(lights);
//		staircaseLightsDetector.onMotionDetected();
//		staircaseLightsDetector.onIdle();
//
//		Switch quickBreakfastSwitch = new Switch();
//		quickBreakfastSwitch.register(new InvertedSwitchableDecorator(shutter));
//		quickBreakfastSwitch.register(coffeeMaker);
//		quickBreakfastSwitch.switchOn();
	}

	private static Switchable createCoffeeMaker() {
		CoffeeMaker coffeeMaker = new CoffeeMaker();
		CoffeeMakerAdapter coffeeMakerSwitch = new CoffeeMakerAdapter(coffeeMaker);
		return coffeeMakerSwitch;
	}


	private static Switchable createLights() {
		Lights lights = new Lights();
		LightsAdapter lightsAdapter = new LightsAdapter(lights);
		return lightsAdapter;
	}

	private static Switchable createShutter() {
		Shutter shutter = new Shutter();
		ShutterAdapter shutterAdapter = new ShutterAdapter(shutter);
		return shutterAdapter;
	}

	private static Switchable createAC() {
		AirConditioning airConditioning = new AirConditioning();
		AirConditioningAdapter acAdapter = new AirConditioningAdapter(airConditioning);
		return acAdapter;
	}

	private static Switchable createStereo() {
		Stereo stereo = new Stereo();
		StereoAdapter stereoAdapter = new StereoAdapter(stereo);
		return stereoAdapter;
	}

}
