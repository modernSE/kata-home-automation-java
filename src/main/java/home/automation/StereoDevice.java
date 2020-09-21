package home.automation;

public class StereoDevice implements SmartHomeDevice {

    Stereo stereo = new Stereo();

    @Override
    public void turnOn() {
       stereo.play("Bob Marley");

    }

    @Override
    public void turnOff() {
        stereo.off();
    }
    


}