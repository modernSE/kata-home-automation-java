package home.automation;

import java.util.List;
import java.util.Arrays;

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

		airConditioning.setValue("20");
		lights.setValue("50");
		stereo.setValue("Bob Marley");
		coffeeMaker.setValue(CoffeeMaker.Type.DECAF.toString());


		List<IDevice> devices = Arrays.asList(shutter,airConditioning,lights,stereo, coffeeMaker );	
		BigOldMasterSwitch s = new BigOldMasterSwitch(devices);
		s.press();

		s.press();
	}

}
