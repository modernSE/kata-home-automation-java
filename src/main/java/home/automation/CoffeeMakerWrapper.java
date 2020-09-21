package home.automation;

public class CoffeeMakerWrapper implements IDevice{
    CoffeeMaker coffeeMaker;

    public CoffeeMakerWrapper(CoffeeMaker coffeeMaker){
        this.coffeeMaker=coffeeMaker;
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