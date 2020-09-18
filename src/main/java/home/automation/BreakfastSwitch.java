

package home.automation;

import java.util.List;

public class BreakfastSwitch {

    Switch motionSwitch;
    DeviceProvider provider = new DeviceProvider();

    BreakfastSwitch() {
        this.motionSwitch = new Switch(provider.getBreakfastDevices());
     
    }

    public void press() {
        motionSwitch.press();
        
    }
    
}