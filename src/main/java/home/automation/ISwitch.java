package home.automation;

import java.util.Set;

public interface ISwitch {
	
	public void addDevice(IAutomationDevice device);
	
	public void addDevices(Set<IAutomationDevice> devices);

}
