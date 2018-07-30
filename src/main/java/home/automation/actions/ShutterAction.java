package home.automation.actions;

import home.automation.Shutter;

public class ShutterAction implements AutomationAction {

	private Shutter shutter;

	public ShutterAction() {
		shutter = new Shutter();
	}
	
	@Override
	public void turnOn() {
		shutter.open();

	}

	@Override
	public void turnOff() {
		shutter.close();
	}

}
