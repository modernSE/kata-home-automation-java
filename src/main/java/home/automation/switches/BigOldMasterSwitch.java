package home.automation.switches;

import home.automation.CoffeeMaker;
import home.automation.CoffeeMaker.Type;
import home.automation.Switch;
import home.automation.actions.AirConditionAction;
import home.automation.actions.CoffeeMakerAction;
import home.automation.actions.LightsAction;
import home.automation.actions.ShutterAction;
import home.automation.actions.StereoAction;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class BigOldMasterSwitch implements ISwitch{

	// Single Responsibility broken: Everything is in this class
	
	private boolean isOn = false;

	private ShutterAction shutterAction = new ShutterAction();

	private AirConditionAction airConditioning = new AirConditionAction(20);

	// Direct instances instead injection - dependency inversion principle
	
	private LightsAction lightsAction = new LightsAction(50);

	private StereoAction stereoAction = new StereoAction("Bob Marley");

	private CoffeeMakerAction coffeeMakerAction = new CoffeeMakerAction(CoffeeMaker.Type.DECAF);

	// The name does not specify what the button does - triggerServicesOnce
	public void press() {
		// if-tree instead of plugins - Open/closed principle
		if (!isOn) {
			System.out.println("BIG OLD SWITCH PRESSED.\n\n");
			
			// All services used should be aggregated - Interface segregation principle
			
			// services start here
			// All values are hard coded and should be injected or at lease settable to the service not the switch
			shutterAction.turnOff();
			airConditioning.turnOn();
			lightsAction.turnOn();
			stereoAction.turnOn();
			coffeeMakerAction.turnOn();
			// services end here
			
			isOn = true;
			printAsciiArt();
		} else if (isOn) {
			shutterAction.turnOn();
			airConditioning.turnOff();
			lightsAction.turnOff();
			stereoAction.turnOff();
			coffeeMakerAction.turnOff();		}
	}

	private void printAsciiArt() {
		// Ascii art should be in a separate class - single responsibility
		StringBuffer b = new StringBuffer();
		b.append("         |\n");
		b.append(" \\     _____     /\n");
		b.append("     /       \\\n");
		b.append("    (         )\n");
		b.append("-   ( ))))))) )   -\n");
		b.append("     \\ \\   / /\n");
		b.append("      \\|___|/\n");
		b.append("  /    |___|    \\\n");
		b.append("       |___| prs\n");
		b.append("       |___|\n");
		System.out.println(b.toString());
	}
}
