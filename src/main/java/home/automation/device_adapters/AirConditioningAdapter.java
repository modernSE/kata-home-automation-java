package home.automation.device_adapters;

import home.automation.AirConditioning;

public class AirConditioningAdapter implements DeviceAdapter {
    int temperature;
    private AirConditioning airConditioning;

    public AirConditioningAdapter(int temperature) {
        airConditioning = new AirConditioning();
        this.temperature = temperature;
    }

    public void activate() {
		airConditioning.setTemperatureInCelsius(temperature);
    }

    public void deactivate() {
		airConditioning.turnOff();
    }
}