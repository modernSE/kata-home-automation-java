package home.automation;

import java.util.Arrays;
import java.util.List;

public class MotionDetector {
    private List<Switch> allSwitches = Arrays.asList(new LightsSwitch(50));

	private boolean isOn = false;
	public void press() {
		if (!isOn) {
			allSwitches.forEach(s -> s.turnOn());
		} else if (isOn) {
			allSwitches.forEach(s -> s.turnOff());
		}
	}
}
