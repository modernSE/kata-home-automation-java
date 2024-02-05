package home.automation;

public class ShutterSwitch  implements Switch{
    private Shutter shutter = new Shutter();

    public void turnOn() {
        shutter.close();
    }

    public void turnOff() {
        shutter.open();
    }
}
