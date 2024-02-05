package home.automation.Handler;

import home.automation.Shutter;

public class ShutterHandler extends SmartObjectHandler{

    public ShutterHandler(int priority) {
        super(priority);
        //TODO Auto-generated constructor stub
    }

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
