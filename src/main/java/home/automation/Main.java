package home.automation;

import java.util.Set;

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
		
		
		BigOldMasterSwitch s = new BigOldMasterSwitch();
		s.addDevice(shutter);
		s.addDevice(airConditioning);
		s.addDevice(lights);
		s.addDevice(stereo);
		s.addDevice(coffeeMaker);
		s.press();

		
	}

}
