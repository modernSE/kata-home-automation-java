package home.automation.device_adapters;

import home.automation.Shutter;

public class ShutterAdapter implements DeviceAdapter {
    private Shutter shutter;

    public ShutterAdapter() {
        shutter = new Shutter();
    }

    public void activate() {
			shutter.open();
    }

    public void deactivate() {
			shutter.close();
    }
}