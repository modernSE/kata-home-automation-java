package home.automation.Handler;

import home.automation.Lights;

public class LightsHandler extends SmartObjectHandler {

    private Lights lights = new Lights();


    @Override
    public void turnOn() {
        lights.dimPercent(50);
        this.switchHandler();
    }

    @Override
    public void turnOff() {
        lights.off();
        this.switchHandler();
    }
    
}
