package home.automation.wrapper;

import home.automation.coffeemaker.CoffeeMaker;

public class CoffeeMakerWrapper implements DeviceWrapper {

	private CoffeeMaker coffeeMaker;
	
	public CoffeeMakerWrapper() {
		coffeeMaker = new CoffeeMaker();
	}
	
	@Override
	public void startWithDefaultAction() {
		coffeeMaker.brew(CoffeeMaker.Type.DECAF);
	}

	@Override
	public void shutDown() {
		if (coffeeMaker.isOn()) {
			coffeeMaker.doClean();
			coffeeMaker.shutDown();
		}
	}

}
