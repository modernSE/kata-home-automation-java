package home.automation;

import java.util.List;

public class MotionDetectorSwitch {

    Switch motionSwitch;
    DeviceProvider provider = new DeviceProvider();

    MotionDetectorSwitch() {
        this.motionSwitch = new Switch(provider.getLights());
     
    }

    public void press() {
        motionSwitch.press();
        
    }
    
}