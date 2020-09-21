package home.automation;

import java.util.ArrayList;
import java.util.List;

public class Switch {

    List<IDevice> devices = new ArrayList<>();

    private boolean isOn = false;


    public void plugIn (List<IDevice> devices) {
        this.devices = devices;
    }

    public boolean isOn(){
        return isOn;
    }

    public void turnOn(){
        isOn=true;
    }

    public void press()
    {
    if(!isOn()){
        turnOn();
        for(IDevice device:devices){
            device.turnOn();
        }

    }else if(isOn()){
        for(IDevice device:devices){
            device.turnOff();
        }
    }
}
    
}