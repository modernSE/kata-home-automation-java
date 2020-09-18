package home.automation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import home.automation.CoffeeMaker.Type;

public class BreakfastSwitch implements Switch{

    private boolean isOn;

    private List<SwitchableComponent> registeredComponents = new ArrayList<>();

    public BreakfastSwitch() {
        registeredComponents = List.of(new ShutterWrapper(true),
            new CoffeeMakerWrapper(Type.ESPRESSO),
            new CoffeeMakerWrapper(Type.ESPRESSO));
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