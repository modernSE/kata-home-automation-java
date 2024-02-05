package home.automation;

public class AnalogRadioPluginSwitch implements Switch{
    private AnalogRadioPlugin analogRadioPlugin = new AnalogRadioPlugin();

    @Override
    public void turnOn() {
        analogRadioPlugin.play();
    }

    @Override
    public void turnOff() {
    }
    
}
