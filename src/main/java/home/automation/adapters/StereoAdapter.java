package home.automation.adapters;

import home.automation.Stereo;
import home.automation.Switchable;

import static home.automation.Switchable.State.*;

/**
 * Created by Ferdinand.Szekeresch on 11.05.2017.
 */
public class StereoAdapter implements Switchable {

	private Stereo stereo;

	private State state = OFF;

	public StereoAdapter(final Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void switchOn() {
		stereo.play("Bob Marley");
		state = ON;
	}

	@Override
	public void switchOff() {
		stereo.rememberPosition();
		stereo.off();
		state = OFF;
	}

	@Override
	public State getStatus() {
		return state;
	}
}
