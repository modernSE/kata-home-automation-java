package home.automation;

public class CoffeeMakerDevice implements SmartHomeDevice {

    CoffeeMaker coffeeMaker;

    public CoffeeMakerDevice() {
        this.coffeeMaker = new CoffeeMaker();
    }

    @Override
    public void turnOn() {
        coffeeMaker.brew(CoffeeMaker.Type.DECAF);
    }

    @Override
    public void turnOff() {
        coffeeMaker.doClean();
        coffeeMaker.shutDown();
    }


    
}