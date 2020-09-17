package home.automation;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class Main {

	public static void main(String[] args) {

		var masterSwitch = new BigOldMasterSwitch();
		registerDevices(masterSwitch);
		
		masterSwitch.press();

		masterSwitch.press();

		var motionDetector = new BigOldMasterSwitch();
		motionDetector.register(new StaircaseLights());
		motionDetector.press();
		motionDetector.press();
	}

	private static void registerDevices(BigOldMasterSwitch sw) {
		var beforePrinter = new SwitchAdapter<>(
			new NotificationOutputPrinter(),
			p -> p.beforeOn(),
			p -> p.beforeOff()
		);
		var shutter = new SwitchAdapter<>(
			new Shutter(), 
			Shutter::close,
			Shutter::open
		);
		var airConditioning = new SwitchAdapter<>(
			new AirConditioning(), 
			ac -> ac.setTemperatureInCelsius(20), 
			ac -> ac.turnOff()
		);
		var lights = new SwitchAdapter<>(
			new Lights(), 
			light -> light.dimPercent(50), 
			light -> light.off()
		);
		var stereo = new SwitchAdapter<>(
			new Stereo(), 
			s -> s.play("Bob Marley"), 
			s -> {s.rememberPosition(); s.off();}
		);
		var coffeeMaker = new SwitchAdapter<>(
			new CoffeeMaker(),
			cm -> cm.brew(CoffeeMaker.Type.DECAF),
			cm -> {
				if (cm.isOn()) {
					cm.doClean();
					cm.shutDown();
				}
			}
		);
		var outOfHomeVaacum = new SwitchAdapter<>(
			new VacuumCleaner(), 
		    VacuumCleaner::off,
			VacuumCleaner::on
		);

		var afterPrinter = new SwitchAdapter<>(
			new NotificationOutputPrinter(),
			printer -> printer.afterOn(),
			printer -> printer.afterOff()
		);

		sw.register(beforePrinter);
		sw.register(shutter);
		sw.register(airConditioning);
		sw.register(lights);
		sw.register(stereo);
		sw.register(coffeeMaker);
		sw.register(outOfHomeVaacum);
		sw.register(afterPrinter);
	}

}
