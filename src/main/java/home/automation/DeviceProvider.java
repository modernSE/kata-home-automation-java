package home.automation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeviceProvider {
    private Shutter shutter = new Shutter();

    private AirConditioning airConditioning = new AirConditioning();

    private Lights lights = new Lights();

    private Stereo stereo = new Stereo();

    private CoffeeMaker coffeeMaker = new CoffeeMaker();

    private LightBulb lightBulb = new LightBulb();

    public List<Device> getAllDevices() {
        List<Device> devices = new ArrayList(
                Arrays.asList(shutter, airConditioning, lights, stereo, coffeeMaker, lightBulb));
        return devices;
    }

    public List<Device> getLights() {
        List<Device> devices = new ArrayList(Arrays.asList(lights, lightBulb));
        return devices;
    }

    public List<Device> getBreakfastDevices() {
        List<Device> devices = new ArrayList(Arrays.asList(shutter, coffeeMaker));
        return devices;
    }

}