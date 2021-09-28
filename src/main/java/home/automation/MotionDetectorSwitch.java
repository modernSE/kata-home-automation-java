package home.automation;

import java.util.Map;

public class MotionDetectorSwitch extends Switch {

	public MotionDetectorSwitch(final Map<Class, Device> devices) {
		super(devices);
	}
    
    public void press() {
        if(!isOn) {
            get(StaircaseLights.class).dimPercent(100);
            isOn = true;
        } else {
            get(StaircaseLights.class).off();
            isOn = false;
        }
    }
    
}
