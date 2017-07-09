package home.automation.adapters;

import home.automation.CoffeeMaker;
import home.automation.Switchable;

import static home.automation.Switchable.State.OFF;
import static home.automation.Switchable.State.ON;

/**
 * Created by Ferdinand.Szekeresch on 11.05.2017.
 */
public class CoffeeMakerAdapter implements Switchable{

	private CoffeeMaker coffeeMaker;

	public CoffeeMakerAdapter(final CoffeeMaker coffeeMaker) {
		this.coffeeMaker = coffeeMaker;
	}

	@Override
	public void switchOn() {
		coffeeMaker.brew(CoffeeMaker.Type.DECAF);
	}

	@Override
	public void switchOff() {
		if (coffeeMaker.isOn()) {
			coffeeMaker.doClean();
			coffeeMaker.shutDown();
		}
	}

	@Override
	public State getStatus() {
		if (coffeeMaker.isOn()) {
			return ON;
		}
		return OFF;
	}
}
