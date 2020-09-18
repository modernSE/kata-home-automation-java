package home.automation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import home.automation.CoffeeMaker.Type;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class BigOldMasterSwitch implements Switch{

    private boolean isOn = false;
    
    private List<SwitchableComponent> registeredComponents = new ArrayList<>();

    public BigOldMasterSwitch() {
        registeredComponents = List.of(
            new ShutterWrapper(true), //
            new AirConditioningWrapper(20), //
            new LightsWrapper(50), //
            new StereoWrapper("Bob Marley"), //
            new CoffeeMakerWrapper(Type.DECAF));
    }

    @Override
    public void registerComponents(SwitchableComponent... components) {
        registeredComponents.addAll(Arrays.asList(components));
    }

    @Override
	public void press() {
		if (!isOn) {
            System.out.println("BIG OLD SWITCH PRESSED.\n\n");
            for (SwitchableComponent switchableComponent : registeredComponents) {
                switchableComponent.switchOn();
            }			
			isOn = true;
			printSwitchPressedStatus();
		} else if (isOn) {
			for (SwitchableComponent switchableComponent : registeredComponents) {
                switchableComponent.switchOff();
            }
		}
	}

    private void printSwitchPressedStatus() {
        StringBuffer b = new StringBuffer();
        b.append("         |\n");
        b.append(" \\     _____     /\n");
        b.append("     /       \\\n");
        b.append("    (         )\n");
        b.append("-   ( ))))))) )   -\n");
        b.append("     \\ \\   / /\n");
        b.append("      \\|___|/\n");
        b.append("  /    |___|    \\\n");
        b.append("       |___| prs\n");
        b.append("       |___|\n");
        System.out.println(b.toString());
    }
}
