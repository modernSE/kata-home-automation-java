package home.automation;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class BigOldMasterSwitch extends Switch {

    BigOldMasterSwitch() {
        devices = List.of(new CoffeeMakerDevice(), new LightsDevice(), new ShutterDevice(), new StereoDevice(), new AirConditioningDevice());

        setLinkedList(devices);
    }


}
