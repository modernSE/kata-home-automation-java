package home.automation;

public class CoffeeMakerAdapter implements Component {

    private final CoffeeMaker coffeeMaker;

    public CoffeeMakerAdapter(CoffeeMaker coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    @Override
    public void whenOn() {
        if (coffeeMaker.isOn()) {
            coffeeMaker.doClean();
            coffeeMaker.shutDown();
        }
    }

    @Override
    public void whenOff() {
        coffeeMaker.brew(CoffeeMaker.Type.DECAF);
    }

}
