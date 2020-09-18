package home.automation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class BigOldMasterSwitch extends Switch {

    public BigOldMasterSwitch(){
        List<IDevice> devices = new ArrayList<>();
        devices.add(new OldSwitchIntroMessage());
        devices.add(new ShutterWrapper(new Shutter()));
        devices.add(new AirConditioningWrapper(new AirConditioning()));
        devices.add(new LightsWrapper(new Lights()));
        devices.add(new StereoWrapper(new Stereo()));
        devices.add(new CoffeeMakerWrapper(new CoffeeMaker()));
        devices.add(new LightBulbPrinter());
        plugIn(devices);
    }
}
