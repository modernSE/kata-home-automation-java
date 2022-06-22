package home.automation;

import java.util.List;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class BigOldMasterSwitch {

	private List<HomeAutomationElement> connectedElements;

	public BigOldMasterSwitch(List<HomeAutomationElement> connectedElements) {
		this.connectedElements = connectedElements;
	}

	private boolean isOn = false;

	private Shutter shutter = new Shutter();

	private AirConditioning airConditioning = new AirConditioning(20);

	private Lights lights = new Lights();

	private Stereo stereo = new Stereo();

	private CoffeeMaker coffeeMaker = new CoffeeMaker();

	public void press() {
		if (!isOn) {
			System.out.println("BIG OLD SWITCH PRESSED.\n\n");
			for (HomeAutomationElement homeAutomationElement : connectedElements) {
				 homeAutomationElement.startUp();
			}
			stereo.play("Bob Marley");
			coffeeMaker.brew(CoffeeMaker.Type.DECAF);

			isOn = true;
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
		} else if (isOn) {
			for (HomeAutomationElement homeAutomationElement : connectedElements) {
				homeAutomationElement.shutDown();
		   }
			/*shutter.open();
			airConditioning.turnOff();
			lights.off();*/
			stereo.rememberPosition();
			stereo.off();
			if (coffeeMaker.isOn()) {
				coffeeMaker.doClean();
				coffeeMaker.shutDown();
			}
		}
	}
}
