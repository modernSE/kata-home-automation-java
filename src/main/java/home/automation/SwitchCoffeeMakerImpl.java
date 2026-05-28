package home.automation;

public class SwitchCoffeeMakerImpl implements HomeSwitch{

    private CoffeeMaker coffeeMaker = new CoffeeMaker();
    private boolean state = false;

    @Override
    public void SwitchState() {
        if(!state)
        {
            coffeeMaker.brew(CoffeeMaker.Type.DECAF);
            state = true;
        }
        else
        {
            coffeeMaker.doClean();
			coffeeMaker.shutDown();
            state = false;
        }
       
    } 
}
