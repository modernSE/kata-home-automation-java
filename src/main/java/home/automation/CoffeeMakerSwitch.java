package home.automation;

public class CoffeeMakerSwitch implements Switch{
    private CoffeeMaker coffeeMaker = new CoffeeMaker();

    private CoffeeMaker.Type coffeeType;

    public CoffeeMakerSwitch(CoffeeMaker.Type coffeeType){
        this.coffeeType = coffeeType;
    }

    @Override
    public void turnOn() {
        coffeeMaker.brew(coffeeType);
    }


    @SuppressWarnings("deprecation")
    @Override
    public void turnOff() {
        if(coffeeMaker.isOn()){
            coffeeMaker.doClean();
            coffeeMaker.shutDown();
        }
    }
}