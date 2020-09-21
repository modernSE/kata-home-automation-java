package home.automation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class BigOldMasterSwitch  {

     Switch motionSwitch;
    DeviceProvider provider = new DeviceProvider();

    BigOldMasterSwitch() {
        this.motionSwitch = new Switch(provider.getAllDevices());
     
    }

    public void press() {
        motionSwitch.press();
        
    }


    
 
}
