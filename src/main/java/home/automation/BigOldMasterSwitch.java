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

	public void press() {
		if (!isOn) {				
			System.out.println("BIG OLD SWITCH PRESSED.\n\n");
			isOn = true;

			shutter.close();
			airConditioning.setTemperatureInCelsius(20);
			lights.dimPercent(50);
			stereo.play();
			coffeeMaker.brew(CoffeeMaker.Type.DECAF);
			showLightBulb();
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

	private void showLightBulb() {
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
