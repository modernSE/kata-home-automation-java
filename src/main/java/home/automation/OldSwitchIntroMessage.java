package home.automation;

public class OldSwitchIntroMessage implements IDevice {

    @Override
    public void turnOn() {
        System.out.println("BIG OLD SWITCH PRESSED.\n\n");

    }

    @Override
    public void turnOff() {
    }
    
}