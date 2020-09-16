package home.automation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class BigOldMasterSwitch {

	private List<ToggleSwitch> switches = new ArrayList<>();

	public void register(ToggleSwitch toggle){
		switches.add(toggle);
	}

	public void press() {

		for (var toggleSwitch : switches) {
			toggleSwitch.toggle();
		}
	}
}
