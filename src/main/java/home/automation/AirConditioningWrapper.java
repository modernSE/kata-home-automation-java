package home.automation;

public class AirConditioningWrapper implements SwitchableComponent {

    private int defaultTemperature;
    private AirConditioning airConditioning;

    public AirConditioningWrapper(int defaultTemperature) {
        this.defaultTemperature = defaultTemperature;
        airConditioning = new AirConditioning();
    }

    @Override
    public void switchOn() {
        airConditioning.setTemperatureInCelsius(defaultTemperature);
    }

    @Override
    public void switchOff() {
        airConditioning.turnOff();
    }
    
}