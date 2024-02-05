package home.automation;

public class StereoSwitch implements Switch{
    private Stereo stereo = new Stereo();
    private String title;

    public StereoSwitch(String title){
        this.title = title;
    }

    public void turnOn(){
        stereo.play(title);
    }

    public void turnOff(){
        stereo.rememberPosition();
        stereo.off();
    }
}
