class AirConditioningSwitch implements DeviceSwitch {
    void on() {
		airConditioning.setTemperatureInCelsius(20);
    }

    void off() {
		airConditioning.turnOff();
    }
}