package home.commands;

import home.automation.CoffeeMaker;

public class CoffeMakerSwitch implements AbstractSwitch{

    private CoffeeMaker coffeeMaker;

    public CoffeMakerSwitch(CoffeeMaker coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    @Override
    public void turnOn() {
        coffeeMaker.brew(CoffeeMaker.Type.DECAF);
    }

    @Override
    public void turnOff() {
        if (coffeeMaker.isOn()) {
			coffeeMaker.doClean();
			coffeeMaker.shutDown();
		}
    }
    
    
}
