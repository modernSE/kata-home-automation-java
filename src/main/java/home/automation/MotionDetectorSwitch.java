package home.automation;

public class MotionDetectorSwitch implements Switch{

    private boolean motionSwitch = false;

    private final Lights lights;

    public MotionDetectorSwitch(Lights lights) {
        this.lights = lights;
    }

    public void pressSwitch(){
        lights.dimPercent(100);
        motionSwitch = true;
    }

    @Override
    public boolean isOn(){
        return motionSwitch;
    }


}
