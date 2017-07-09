package home.automation.adapters;

import home.automation.Switchable;

/**
 * Created by Ferdinand.Szekeresch on 11.05.2017.
 */
public class InvertedSwitchableDecorator implements Switchable {

	State state = State.OFF;

	Switchable s;

	public InvertedSwitchableDecorator(Switchable s) {
		this.s = s;
	}

	@Override
	public void switchOn() {
		s.switchOff();
		state = State.ON;
	}

	@Override
	public void switchOff() {
		s.switchOn();
		state = State.OFF;
	}

	@Override
	public State getStatus() {
		return state;
	}

}
