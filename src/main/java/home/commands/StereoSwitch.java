package home.commands;

import home.automation.Stereo;

public class StereoSwitch implements AbstractSwitch{

    private Stereo stereo;
    

    public StereoSwitch(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void turnOn() {
        stereo.play("Bob Marley");
    }

    @Override
    public void turnOff() {
        stereo.rememberPosition();
        stereo.off();
    }
    
}
