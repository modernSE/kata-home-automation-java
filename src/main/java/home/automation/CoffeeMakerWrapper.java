package home.automation;

import home.automation.CoffeeMaker.Type;

public class CoffeeMakerWrapper implements SwitchableComponent{

    private CoffeeMaker coffeeMaker;
    private Type type;

    public CoffeeMakerWrapper(Type type) {
        this.type = type;
        coffeeMaker = new CoffeeMaker();
    }

    @Override
    public void switchOn() {
        coffeeMaker.brew(type);
    }

    @Override
    public void switchOff() {
        if (coffeeMaker.isOn()) {
			coffeeMaker.doClean();
			coffeeMaker.shutDown();
		}
    }
    
}