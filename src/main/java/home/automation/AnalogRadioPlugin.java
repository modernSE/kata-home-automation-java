package home.automation;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class AnalogRadioPlugin extends AbstractHomeComponent {

	@Override
	public void changeState(String state) {
		System.out.println("Playing analog radio");
	}

}
