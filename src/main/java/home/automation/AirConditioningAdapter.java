package home.automation;

public class AirConditioningAdapter implements Component {

    private final AirConditioning airConditioning;

    public AirConditioningAdapter(AirConditioning airConditioning) {
        this.airConditioning = airConditioning;
    }

    @Override
    public void whenOn() {
        airConditioning.turnOff();

    }

    @Override
    public void whenOff() {
        airConditioning.setTemperatureInCelsius(20);
    }

}
