package home;

import home.automation.device_adapters.DeviceAdapter;

public class InversionDecorator implements DeviceAdapter {

    private DeviceAdapter inner;

    public InversionDecorator(DeviceAdapter inner) {
        this.inner = inner;
    }

    @Override
    public void activate() {
        inner.deactivate();
    }

    @Override
    public void deactivate() {
        inner.activate();
    }
    
}
