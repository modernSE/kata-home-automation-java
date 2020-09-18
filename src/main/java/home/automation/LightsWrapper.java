package home.automation;

public class LightsWrapper implements SwitchableComponent {

    private int defaultDim;
    private Lights lights;

    public LightsWrapper(int defaultDim) {
        this.defaultDim = defaultDim;
        lights = new Lights();
    }

    @Override
    public void switchOn() {
        lights.dimPercent(defaultDim);
    }

    @Override
    public void switchOff() {
        lights.off();
    }
    
}