package home.automation;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class Main {

	public static void main(String[] args) {

		var shutter = new Shutter();
		var airConditioning = new AirConditioning();
		var lights = new Lights();
		var stereo = new Stereo();
		var coffeeMaker = new CoffeeMaker();
		var vaccumCleaner = new VaccumCleaner();

		var bigOldMasterSwitch = new BigOldMasterSwitch(shutter, airConditioning, lights, stereo, coffeeMaker);
		var motionDetectorSwitch = new MotionDetectorSwitch(lights);
		var quickBreakfastSwitch = new QuickBreakfastSwitch(coffeeMaker, shutter);

		bigOldMasterSwitch.pressSwitch();
		bigOldMasterSwitch.pressSwitch();
		
		motionDetectorSwitch.pressSwitch();
		quickBreakfastSwitch.pressSwitch();
		
		if(isCleaningAllowed(bigOldMasterSwitch, motionDetectorSwitch, quickBreakfastSwitch)) vaccumCleaner.clean();
	}

	private static boolean isCleaningAllowed(BigOldMasterSwitch bigOldMasterSwitch, MotionDetectorSwitch motionDetectorSwitch, QuickBreakfastSwitch quickBreakfastSwitch){
		return !(bigOldMasterSwitch.isOn() || motionDetectorSwitch.isOn() || quickBreakfastSwitch.isOn());
	}
}
