package home.automation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MotionDetector implements Switch {

    private boolean isOn = false;

    private List<SwitchableComponent> registeredComponents= new ArrayList<>();

    public MotionDetector() {
        registeredComponents = List.of(new LightsWrapper(100));
    }

    @Override
    public void registerComponents(SwitchableComponent... components) {
        registeredComponents.addAll(Arrays.asList(components));
    }

    @Override
    public void press() {
        if (!isOn) {
            for (SwitchableComponent switchableComponent : registeredComponents) {
                switchableComponent.switchOn();
            }	
            isOn = true;
        } else {
            for (SwitchableComponent switchableComponent : registeredComponents) {
                switchableComponent.switchOff();
            }	
            isOn = false;
        }
    }
    
}