package home.commands;

import home.automation.Lights;

public class LightsSwitch implements AbstractSwitch{

    private Lights lights;

    

    public LightsSwitch(Lights lights) {
        this.lights = lights;
    }

    @Override
    public void turnOn() {
        lights.dimPercent(50);
     }

    @Override
    public void turnOff() {
        lights.off();
    }

    
}
