package home.automation;

import java.util.Collection;
import java.util.LinkedList;

/**
 * Created by Ferdinand.Szekeresch on 11.05.2017.
 */
public class Switch implements Switchable {

	State state = State.OFF;

	Collection<Switchable> switchables = new LinkedList<>();

	public void register(Switchable s) {
		switchables.add(s);
	}

	public void switchOn() {
		switchables.forEach(Switchable::switchOn);
		state = State.ON;
	}

	public void switchOff() {
		switchables.forEach(Switchable::switchOff);
		state = State.OFF;
	}

	public State getStatus() {
		return state;
	}
}