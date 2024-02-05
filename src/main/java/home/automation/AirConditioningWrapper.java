package home.automation;

public class AirConditioningWrapper implements Switchable {
    
    private AirConditioning airConditioning;

    public AirConditioningWrapper(AirConditioning airConditioning) {
        this.airConditioning = airConditioning;
    }
    
    public void on() {
        airConditioning.setTemperatureInCelsius(20);
    }

    public void off() {
        airConditioning.turnOff();
    }
}
