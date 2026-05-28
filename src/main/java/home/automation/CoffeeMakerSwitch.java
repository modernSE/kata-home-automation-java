class CoffeeMakerSwitch implements DeviceSwitch {
    void on() {
		coffeeMaker.brew(CoffeeMaker.Type.DECAF);
    }
    void off() {
        if (coffeeMaker.isOn()) {
            coffeeMaker.doClean();
            coffeeMaker.shutDown();
        }        
    }
}