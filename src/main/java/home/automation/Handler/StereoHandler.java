package home.automation.Handler;

import home.automation.Stereo;

public class StereoHandler extends SmartObjectHandler {

    public StereoHandler(int priority) {
        super(priority);
        //TODO Auto-generated constructor stub
    }

    private Stereo stereo = new Stereo();

    @Override
    public void turnOn() {
        stereo.play("Bob Marley");
        this.switchHandler();
    }

    @Override
    public void turnOff() {
        stereo.rememberPosition();
        stereo.off();
        this.switchHandler();
    }
    
}
