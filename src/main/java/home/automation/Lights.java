package home.automation;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class Lights extends AbstractHomeComponent implements Stoppable {

	/**
	 * NOTE: starting from the next Software update, dimPercent will not work if the turnOn() method has not been called
	 * before.
	 **/
	@Override
	public void changeState(String i) {
		System.out.println("Dimming to " + i + "%");
	}

	@Override
	public void stop() {
		System.out.println("Lights will go out in 10 seconds.");
	}
}
