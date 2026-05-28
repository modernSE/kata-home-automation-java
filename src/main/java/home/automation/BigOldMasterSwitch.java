package home.automation;

import java.util.List;

import home.automation.*;
import home.automation.operations.ConditionalOperation;
import home.automation.operations.PrintingOperation;
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

	private Switch s = new Switch(List.of(
		new PrintingOperation("BIG OLD SWITCH PRESSED.\n\n"),
			() -> shutter.close(),
			() -> airConditioning.setTemperatureInCelsius(20),
			() -> lights.dimPercent(50),
			() -> stereo.play("Bob Marley"),
			() -> coffeeMaker.brew(CoffeeMaker.Type.DECAF),
			new PrintingOperation(new StringBuilder()
				.append("         |\n")
				.append(" \\     _____     /\n")
				.append("     /       \\\n")
				.append("    (         )\n")
				.append("-   ( ))))))) )   -\n")
				.append("     \\ \\   / /\n")
				.append("      \\|___|/\n")
				.append("  /    |___|    \\\n")
				.append("       |___| prs\n")
				.append("       |___|\n")
				.toString())),
		List.of(
			() -> shutter.open(),
			() -> airConditioning.turnOff(),
			() -> lights.off(),
			() -> stereo.rememberPosition(),
			() -> stereo.off(),
			new ConditionalOperation(() -> coffeeMaker.isOn(), ()-> {
				coffeeMaker.doClean();
				coffeeMaker.shutDown();
			})
		)
	);

	public void press() {
		s.press();
	}
}
