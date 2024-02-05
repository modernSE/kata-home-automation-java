package home.automation;

import java.util.Arrays;
import java.util.List;

public class QuickBreakfastSwitch {
    private List<Switch> allSwitches = Arrays.asList(new ShutterSwitch(), new CoffeeMakerSwitch(CoffeeMaker.Type.DECAF));

	private boolean isOn = false;
	public void press() {
		if (!isOn) {
			allSwitches.forEach(s -> s.turnOn());
		} else if (isOn) {
			allSwitches.forEach(s -> s.turnOff());
		}
	}
}
