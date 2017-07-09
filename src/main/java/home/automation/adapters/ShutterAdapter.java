package home.automation.adapters;

import home.automation.Shutter;
import home.automation.Switchable;

import static home.automation.Switchable.State.OFF;
import static home.automation.Switchable.State.ON;

/**
 * Created by Ferdinand.Szekeresch on 11.05.2017.
 */
public class ShutterAdapter implements Switchable{
	private Shutter shutter;

	private State state = OFF;

	public ShutterAdapter(final Shutter shutter) {
		this.shutter = shutter;
	}

	@Override
	public void switchOn() {
		shutter.close();
		state = ON;
	}

	@Override
	public void switchOff() {
		shutter.open();
		state = OFF;
	}

	@Override
	public State getStatus() {
		return state;
	}
}
