package home.automation;

/**
 * Created by Ferdinand.Szekeresch on 11.05.2017.
 */
public class VacuumCleaner implements Switchable {

	State state = State.OFF;

	@Override
	public void switchOn() {
		System.out.println("What a mess! No more peanut-eating on the couch!");
		state = State.ON;
	}

	@Override
	public void switchOff() {
		System.out.println("Ok. I'll leave it at that.");
		state = State.OFF;
	}

	@Override
	public State getStatus() {
		return state;
	}
}
