package home.automation;

import java.util.List;

public class Switch {

    private List<Device> devices;

    Switch(List<Device> devices) {
        this.devices = devices;
    }
    
   
     private boolean isOn = false;

    

    public void press() {
        if (!isOn) {
            on();
        } else if (isOn) {
            off();
        }
    }

    private void on() {
        for (Device device : devices) {
            device.on();
        }
    }

    private void off() {
        for (Device device : devices) {
            device.off();
        }

    }
}