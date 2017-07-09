package home.automation.adapters;

import home.automation.AirConditioning;
import home.automation.Switchable;

import static home.automation.Switchable.State.*;

/**
 * Created by Ferdinand.Szekeresch on 11.05.2017.
 */
public class AirConditioningAdapter implements Switchable {

	private AirConditioning airConditioning;

	State state = OFF;

	public AirConditioningAdapter(final AirConditioning ac) {
		this.airConditioning = ac;
	}

	@Override
	public void switchOn() {
		airConditioning.setTemperatureInCelsius(20);
		state = ON;
	}

	@Override
	public void switchOff() {
		airConditioning.turnOff();
		state = OFF;
	}

	@Override
	public State getStatus() {
		return state;
	}
}
