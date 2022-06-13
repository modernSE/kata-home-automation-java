package home.automation;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class Main {

	public static void main(String[] args) {

		Shutter shutter = new Shutter();
		AirConditioning airConditioning = new AirConditioning();
		Lights lights = new Lights();
		Stereo stereo = new Stereo();
		CoffeeMaker coffeeMaker = new CoffeeMaker();
		
		BigOldMasterSwitch s = new BigOldMasterSwitch(shutter, airConditioning, lights, stereo, coffeeMaker);
		s.press();

		s.press();
	}

}
