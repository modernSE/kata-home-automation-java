package home.automation;

public class LightsSwitch implements Switch{
    private Lights lights = new Lights();

    private int percent;

    public LightsSwitch(int percent){
        this.percent = percent;
    }

    public void turnOn() {
        lights.dimPercent(percent);
    }

    public void turnOff() {
        lights.off();
    }
    
}
