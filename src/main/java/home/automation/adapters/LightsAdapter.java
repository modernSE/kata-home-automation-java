package home.automation.adapters;

import home.automation.Lights;
import home.automation.Switchable;

import static home.automation.Switchable.State.*;

/**
 * Created by Ferdinand.Szekeresch on 11.05.2017.
 */
public class LightsAdapter implements Switchable {

	private final Lights lights;

	private State state = OFF;

	public LightsAdapter(Lights lights) {
		this.lights = lights;
	}

	@Override
	public void switchOn() {
		lights.dimPercent(50);
		this.state = ON;
	}

	@Override
	public void switchOff() {
		lights.off();
		this.state = OFF;
	}


	@Override
	public State getStatus() {
		return state;
	}
}
