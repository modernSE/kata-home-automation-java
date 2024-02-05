package home;

import java.util.List;

import home.automation.AirConditioning;
import home.automation.CoffeeMaker;
import home.automation.Lights;
import home.automation.Shutter;
import home.automation.Stereo;
import home.commands.AbstractSwitch;
import home.commands.AirConditioningSwitch;
import home.commands.CoffeMakerSwitch;
import home.commands.LightsSwitch;
import home.commands.ShutterSwitch;
import home.commands.StereoSwitch;

public class config {
    // Definiert alle switches
    private ShutterSwitch shutter = new ShutterSwitch(new Shutter());

	private AirConditioningSwitch airConditioning = new AirConditioningSwitch(new AirConditioning());

	private LightsSwitch lights = new LightsSwitch(new Lights());

	private StereoSwitch stereo = new StereoSwitch(new Stereo());

	private CoffeMakerSwitch coffeeMaker = new CoffeMakerSwitch(new CoffeeMaker());
    // added alle switzes zur list

    private List<AbstractSwitch> master = List.of(shutter,airConditioning,lights,stereo,coffeeMaker);
    private List<AbstractSwitch> quickBreakfast = List.of(shutter,coffeeMaker);
    
    public List<AbstractSwitch> getMaster() {
        return master;
    }
    public List<AbstractSwitch> getQuickBreakfast() {
        return quickBreakfast;
    }
}
