package home.automation;

public class StereoAdapter implements Component {

    private final Stereo stereo;

    public StereoAdapter(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void whenOn() {
        stereo.rememberPosition();
        stereo.off();
    }

    @Override
    public void whenOff() {
        stereo.play("Bob Marley");
    }

}
