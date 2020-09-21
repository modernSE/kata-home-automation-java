package home.automation;

public class ShutterDevice implements SmartHomeDevice {
    Shutter shutter = new Shutter();

    @Override
    public void turnOn() {
       shutter.close();
    }

    @Override
    public void turnOff() {
        shutter.open();
    }

}