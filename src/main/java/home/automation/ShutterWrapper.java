package home.automation;

public class ShutterWrapper implements IDevice{

    Shutter shutter;
    public ShutterWrapper(Shutter shutter){
        this.shutter=shutter;
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