package home.automation;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class BigOldMasterSwitch implements Switch {

	private boolean masterSwitch = false;

	private final Shutter shutter;

	private final AirConditioning airConditioning;

	private final Lights lights;

	private final Stereo stereo;

	private final CoffeeMaker coffeeMaker;

	

	public BigOldMasterSwitch(Shutter shutter, AirConditioning airConditioning, Lights lights, Stereo stereo,
			CoffeeMaker coffeeMaker) {
		this.shutter = shutter;
		this.airConditioning = airConditioning;
		this.lights = lights;
		this.stereo = stereo;
		this.coffeeMaker = coffeeMaker;
	}

	@Override
	public void pressSwitch() {
		if (!masterSwitch) turnOn();
		else turnOff();
	}

	private void turnOff() {
		shutter.open();
		airConditioning.turnOff();
		lights.off();
		turnOffStereo();
		if (coffeeMaker.isOn()) {
			turnOffCoffeeMaker();
		}
	}

	private void turnOffStereo() {
		stereo.rememberPosition();
		stereo.off();
	}

	private void turnOffCoffeeMaker() {
		coffeeMaker.doClean();
		coffeeMaker.shutDown();
	}

	private void turnOn() {
		System.out.println("BIG OLD SWITCH PRESSED.\n\n");
		shutter.close();
		airConditioning.setTemperatureInCelsius(20);
		lights.dimPercent(50);
		stereo.play("Bob Marley");
		coffeeMaker.brew(CoffeeMaker.Type.DECAF);
		masterSwitch = true;
		printAsciLight();
	}

	private void printAsciLight() {
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

	@Override
	public boolean isOn(){
		return masterSwitch;
	}
}
