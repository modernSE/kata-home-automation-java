package home.automation;

public class LightsAdapter implements Component {

    private final Lights lights;

    public LightsAdapter(Lights lights) {
        this.lights = lights;
    }

    @Override
    public void whenOn() {

        lights.off();
    }

    @Override
    public void whenOff() {
        lights.dimPercent(50);
    }

}
