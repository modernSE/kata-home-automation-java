package home.automation.device_adapters;

import home.automation.Lights;

public class LightsAdapter implements DeviceAdapter {
    int dimPercent;
    private Lights light;

    public LightsAdapter(int dimPercent) {
        light = new Lights();
        this.dimPercent = dimPercent;
    }

    public void activate() {
		light.dimPercent(dimPercent);
    }

    public void deactivate() {
		light.off();
    }
}