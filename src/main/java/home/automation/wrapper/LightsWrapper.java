package home.automation.wrapper;

import home.automation.Lights;

public class LightsWrapper implements DeviceWrapper{

	private Lights lights;
	
	public LightsWrapper() {
	  lights = new Lights();	
	}
	
	@Override
	public void startWithDefaultAction() {
		lights.dimPercent(50);
	}

	@Override
	public void shutDown() {
		lights.off();
	}
}
