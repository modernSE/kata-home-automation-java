class ShutterSwitch implements DeviceSwitch {
	private Shutter shutter = new Shutter();

    void on() {
        shutter.close();
    }

    void off () {
		shutter.open();
    }
}