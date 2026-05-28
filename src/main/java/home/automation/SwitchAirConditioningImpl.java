package home.automation;

public class SwitchAirConditioningImpl implements HomeSwitch{

    private AirConditioning airCon = new AirConditioning();
    private boolean state = false;

    @Override
    public void SwitchState() {
        if(!state)
        {
            airCon.setTemperatureInCelsius(20);
            state = true;
        }
        else
        {
            airCon.turnOff();
            state = false;
        }
       
    } 
}
