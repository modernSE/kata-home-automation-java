package home.automation.device_adapters;

import home.automation.CoffeeMaker;

public class CoffeeMakerAdapter implements DeviceAdapter {
    CoffeeMaker.Type type;
    private CoffeeMaker coffeeMaker;

    public CoffeeMakerAdapter(CoffeeMaker.Type coffeeType) {
      coffeeMaker = new CoffeeMaker();
      type = coffeeType;
    }

    public void activate() {
			coffeeMaker.brew(type);
    }

    public void deactivate() {
      if (coffeeMaker.isOn()) {
				coffeeMaker.doClean();
				coffeeMaker.shutDown();
			}    }
}