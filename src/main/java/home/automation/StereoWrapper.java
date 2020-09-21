package home.automation;

public class StereoWrapper implements IDevice{

    Stereo stereo;

    public StereoWrapper(Stereo stereo){
        this.stereo=stereo;

    }

    @Override
    public void turnOn() {
        stereo.play("Bob Marley");

    }

    @Override
    public void turnOff() {
        stereo.rememberPosition();
	    stereo.off();
    }}