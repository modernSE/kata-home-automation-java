package home.automation;

public class LightWrapper implements Switchable {

    private Lights lights;

    public LightWrapper(Lights lights) {
        this.lights = lights;
    }
    
    public void on() {
        lights.dimPercent(20);
    }

    public void off() {
        lights.off();
    }
}
