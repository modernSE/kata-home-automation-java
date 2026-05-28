class LightSwitch implements DeviceSwitch {
    void on() {
		lights.dimPercent(50);
    }
    void off() {
		lights.off();
    }
}