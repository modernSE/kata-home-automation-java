package home.automation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class Main {

	public static void main(String[] args) {

		List<HomeAutomationElement> elementsToConnect = new ArrayList<>();
		 Shutter shutter = new Shutter();
		 AirConditioning airConditioning = new AirConditioning(20);
		 Lights lights = new Lights();
		 elementsToConnect.add(shutter);
		 elementsToConnect.add(airConditioning);
		 elementsToConnect.add(lights);
		//private Stereo stereo = new Stereo();
		//private CoffeeMaker coffeeMaker = new CoffeeMaker();

		BigOldMasterSwitch s = new BigOldMasterSwitch(elementsToConnect);
		s.press();

		s.press();
	}

}
