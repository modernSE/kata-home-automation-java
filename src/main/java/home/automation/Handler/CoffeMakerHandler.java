package home.automation.Handler;

import home.automation.CoffeeMaker;

public class CoffeMakerHandler extends SmartObjectHandler {

    public CoffeMakerHandler(int priority) {
        super(priority);
        //TODO Auto-generated constructor stub
    }

    private CoffeeMaker coffeeMaker = new CoffeeMaker();

    @Override
    public void turnOn() {
        coffeeMaker.brew(CoffeeMaker.Type.DECAF);
        this.switchHandler();
    }

    @Override
    public void turnOff() {
        if (coffeeMaker.isOn()) {
            coffeeMaker.doClean();
            coffeeMaker.shutDown();
            this.switchHandler();
        }
    }
    
}
