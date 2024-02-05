package home.commands;

import home.automation.Shutter;

public class ShutterSwitch implements AbstractSwitch{
    private Shutter shutter;

    
    public ShutterSwitch(Shutter shutter) {
        this.shutter = shutter;
    }

    @Override
    public void turnOn() {
        shutter.close();
    }

    @Override
    public void turnOff() {
        shutter.open();
    }
    
}
