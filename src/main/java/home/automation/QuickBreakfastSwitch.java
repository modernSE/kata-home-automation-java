package home.automation;

public class QuickBreakfastSwitch implements Switch{

    private boolean breakfastSwitch = false;
    
    private final CoffeeMaker coffeeMaker;
    private final Shutter shutter;


    public QuickBreakfastSwitch(CoffeeMaker coffeeMaker, Shutter shutter) {
        this.coffeeMaker = coffeeMaker;
        this.shutter = shutter;
    }

    @Override
    public void pressSwitch(){
		coffeeMaker.brew(CoffeeMaker.Type.DECAF);
        shutter.open();
        breakfastSwitch = true;
    }

    @Override
    public boolean isOn(){
        return breakfastSwitch;
    }
}
