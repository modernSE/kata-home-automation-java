package home.automation;

import java.util.List;

import home.InversionDecorator;
import home.automation.device_adapters.AirConditioningAdapter;
import home.automation.device_adapters.CoffeeMakerAdapter;
import home.automation.device_adapters.DeviceAdapter;
import home.automation.device_adapters.LightsAdapter;
import home.automation.device_adapters.ShutterAdapter;
import home.automation.device_adapters.StereoAdapter;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class BigOldMasterSwitch extends Switch {

	private boolean isOn = false;

	private Shutter shutter = new Shutter();

	private AirConditioning airConditioning = new AirConditioning();

	private Lights lights = new Lights();

	private Stereo stereo = new Stereo();

	private CoffeeMaker coffeeMaker = new CoffeeMaker();

	public BigOldMasterSwitch() {
		List<DeviceAdapter> devices = List.of(
				new InversionDecorator(new ShutterAdapter()),
				new AirConditioningAdapter(20),
				new LightsAdapter(50),
				new StereoAdapter("Bob Marley"),
				new CoffeeMakerAdapter(CoffeeMaker.Type.DECAF)
			);
		super(devices);
	}
}
