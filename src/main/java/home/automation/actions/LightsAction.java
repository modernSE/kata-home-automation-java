package home.automation.actions;

import home.automation.Lights;

public class LightsAction implements AutomationAction {
	
	private Lights lights;

	private int percent;

	public LightsAction(int percent) {
		lights = new  Lights();
		this.percent = percent;
		
	}

	@Override
	public void turnOn() {
		lights.dimPercent(percent);

	}

	@Override
	public void turnOff() {
		lights.off();
	}
}
