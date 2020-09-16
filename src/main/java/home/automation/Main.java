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
	}

	private static void registerDevices(BigOldMasterSwitch s) {
		var beforePrinter = new LegacySwitchAdapter<>(
			new NotificationOutputPrinter(),
			p -> p.beforeOn(),
			p -> p.beforeOff()
		);
		var shutter = new LegacySwitchAdapter<>(
			new Shutter(), 
			Shutter::close,
			Shutter::open
		);
		var airConditioning = new LegacySwitchAdapter<>(
			new AirConditioning(), 
			ac -> ac.setTemperatureInCelsius(20), 
			ac -> ac.turnOff()
		);
		var lights = new LegacySwitchAdapter<>(
			new Lights(), 
			light -> light.dimPercent(50), 
			light -> light.off()
		);
		var stereo = new LegacySwitchAdapter<>(
			new Stereo(), 
			s -> s.play("Bob Marley"), 
			s -> {s.rememberPosition(); s.off();}
		);
		var coffeeMaker = new LegacySwitchAdapter<>(
			new CoffeeMaker(),
			cm -> cm.brew(CoffeeMaker.Type.DECAF),
			cm -> {
				if (cm.isOn()) {
					cm.doClean();
					cm.shutDown();
				}
			}
		);
		var afterPrinter = new LegacySwitchAdapter<>(
			new NotificationOutputPrinter(),
			printer -> printer.afterOn(),
			printer -> printer.afterOff()
		);


		s.register(beforePrinter);
		s.register(shutter);
		s.register(airConditioning);
		s.register(lights);
		s.register(stereo);
		s.register(coffeeMaker);
		s.register(afterPrinter);
	}

}
