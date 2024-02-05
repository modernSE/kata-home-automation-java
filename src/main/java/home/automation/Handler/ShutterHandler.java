package home.automation.Handler;

import home.automation.Shutter;

public class ShutterHandler extends SmartObjectHandler{

    private Shutter shutter = new Shutter();

    @Override
    public void turnOn() {
        shutter.close();
        this.switchHandler();
    }

    @Override
    public void turnOff() {
        shutter.open();
        this.switchHandler();
    }
    
}
