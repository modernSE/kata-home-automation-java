package home.automation.wrapper;

import home.automation.Shutter;

public class ShutterWrapper implements DeviceWrapper{
	
	private Shutter shutter;
	
	public ShutterWrapper() {
		shutter = new Shutter();
	}
	
	public void startWithDefaultAction() {
		shutter.close();
	}

	@Override
	public void shutDown() {
		shutter.open();
	}

}
