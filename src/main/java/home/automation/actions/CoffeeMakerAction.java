package home.automation.actions;

import home.automation.CoffeeMaker;
import home.automation.CoffeeMaker.Type;

public class CoffeeMakerAction implements AutomationAction {

	private CoffeeMaker coffeeMaker;
	
	private Type type;

	public CoffeeMakerAction(Type type) {
		this.type = type;
		this.coffeeMaker = new CoffeeMaker();
	}
	
	@Override
	public void turnOn() {
		coffeeMaker.brew(type);
	}

	@Override
	public void turnOff() {
		if (coffeeMaker.isOn()) {
			coffeeMaker.doClean();
			coffeeMaker.shutDown();
		}
	}

}
