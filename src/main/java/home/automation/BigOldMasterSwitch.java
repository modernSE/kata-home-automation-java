package home.automation;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class BigOldMasterSwitch {

	private boolean isOn = false;

	private Shutter shutter = new Shutter();

	private AirConditioning airConditioning = new AirConditioning();

	private Lights lights = new Lights();

	private Stereo stereo = new Stereo();

	private CoffeeMaker coffeeMaker = new CoffeeMaker();

	private List<AbstractHomeComponent> components;

	public void press() {
			for (AbstractHomeComponent comp : components) {
				comp.toggle();
			}
	}
	public void press() {
		if (!isOn) {
			System.out.println("BIG OLD SWITCH PRESSED.\n\n");
			shutter.close();
			airConditioning.setTemperatureInCelsius(20);
			lights.dimPercent(50);
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
			shutter.open();
			airConditioning.turnOff();
			lights.off();
			stereo.rememberPosition();
			stereo.off();
			if (coffeeMaker.isOn()) {
				coffeeMaker.doClean();
				coffeeMaker.shutDown();
			}
		}
	}
}
