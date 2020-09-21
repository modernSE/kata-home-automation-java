package home.automation;

public class AirConditioningWrapper implements IDevice {
    AirConditioning airConditioning;
    public AirConditioningWrapper(AirConditioning airConditioning){
        this.airConditioning=airConditioning;
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