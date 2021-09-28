package home.automation;

import java.util.Map;

public abstract class Switch {

    protected boolean isOn = false;
    private final Map<Class, Device> devices;

    public Switch(final Map<Class, Device> devices) {
        this.devices = devices;
    }

    protected <T> T get(Class<T> clazz) {
		return (T) devices.get(clazz);
	}

    public abstract void press();
    
}
