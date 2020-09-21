package home.automation;

import java.util.LinkedList;
import java.util.List;

public class Switch {
    
    List<SmartHomeDevice> devices = new LinkedList();


	private boolean isOn = false;


    
	public void press() {
		for(SmartHomeDevice currentDevice : devices) {

            if(isOn){
                currentDevice.turnOff();
            }
            else{
                currentDevice.turnOn();
            }
        }
        isOn = !isOn;
    }
    
    public void setLinkedList(List<SmartHomeDevice> devices) {
        this.devices = devices;
    }


}