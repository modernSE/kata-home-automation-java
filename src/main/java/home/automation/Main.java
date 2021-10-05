package home.automation;

import java.util.Arrays;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class Main {
	public static void main(String[] args) {
		Device shutter = new Shutter();
		Device airConditioning = new AirConditioning();
		Device lights = new Lights();
		Device stereo = new Stereo();
		Device coffeeMaker = new CoffeeMaker();
		
		var list = Arrays.asList(shutter, airConditioning, lights, stereo, coffeeMaker);
		SwitchFactory factory = new SwitchFactory();
		
		var newSwitch = factory.makeSwitchWithDevices(list);
		newSwitch.press();
		newSwitch.press();


		//BigOldMasterSwitch s = new BigOldMasterSwitch();
		//s.press();
		//s.press();
	}

}
