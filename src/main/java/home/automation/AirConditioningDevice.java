package home.automation;

public class AirConditioningDevice implements SmartHomeDevice {

    private AirConditioning airConditioning;

    AirConditioningDevice() {
        this.airConditioning = new AirConditioning();
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