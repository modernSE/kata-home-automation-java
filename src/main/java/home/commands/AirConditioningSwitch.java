package home.commands;
import home.automation.AirConditioning;

public class AirConditioningSwitch implements AbstractSwitch{

    AirConditioning airConditioning;

    public AirConditioningSwitch(AirConditioning airConditioning){
        this.airConditioning = airConditioning;
    }

    @Override
    public void turnOn() {
        airConditioning.setTemperatureInCelsius(20);
		
    }

    @Override
    public void turnOff() {
        airConditioning.turnOff();
    }
    
    
}