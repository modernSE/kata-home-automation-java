package home.automation.Handler;

import home.automation.AirConditioning;

public class AirConditioningHandler extends SmartObjectHandler {

    public AirConditioningHandler(int priority) {
        super(priority);
        //TODO Auto-generated constructor stub
    }

    private AirConditioning airConditioning = new AirConditioning();
    @Override
    public void turnOn() {
        this.airConditioning.setTemperatureInCelsius(20);
        this.switchHandler();
    }

    @Override
    public void turnOff() {
        this.airConditioning.turnOff();
        this.switchHandler();
    }
    
}
