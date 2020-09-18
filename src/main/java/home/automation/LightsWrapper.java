package home.automation;

public class LightsWrapper implements IDevice{
    Lights lights;

    public LightsWrapper(Lights lights){
        this.lights=lights;
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