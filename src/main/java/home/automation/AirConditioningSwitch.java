package home.automation;

public class AirConditioningSwitch  implements Switch{
    private AirConditioning airConditioning = new AirConditioning();
    private int temperatureCelsius;

    public AirConditioningSwitch(int temperature){
        temperatureCelsius = temperature;
    }

    @Override
    public void turnOn() {
        airConditioning.setTemperatureInCelsius(temperatureCelsius);
    }

    @Override
    public void turnOff() {
        airConditioning.turnOff();
    }
    
}
