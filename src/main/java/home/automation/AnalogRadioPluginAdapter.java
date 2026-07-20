package home.automation;

public class AnalogRadioPluginAdapter implements Component{

    private final AnalogRadioPlugin analogRadioPlugin;

    public AnalogRadioPluginAdapter(AnalogRadioPlugin analogRadioPlugin) {
        this.analogRadioPlugin = analogRadioPlugin;
    }

    @Override
    public void whenOn() {
    }

    @Override
    public void whenOff() {
    }

}
