package home.automation;

public class StereoWrapper implements SwitchableComponent {

    private String songOnStartUp;
    private Stereo stereo;

    public StereoWrapper(String songOnStartUp) {
        this.songOnStartUp = songOnStartUp;
        stereo = new Stereo();
    }

    @Override
    public void switchOn() {
        stereo.play(songOnStartUp);
    }

    @Override
    public void switchOff() {
        stereo.rememberPosition();
        stereo.off();
    }
}