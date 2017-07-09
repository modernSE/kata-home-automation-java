package home.automation;

/**
 * Created by Ferdinand.Szekeresch on 11.05.2017.
 */
public interface Switchable {

	enum State {ON, OFF}

	void switchOn();

	void switchOff();

	State getStatus();

}
