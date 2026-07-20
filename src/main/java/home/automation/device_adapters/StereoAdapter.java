package home.automation.device_adapters;

import home.automation.Stereo;

public class StereoAdapter implements DeviceAdapter {
    String song;
    private Stereo stereo;

    public StereoAdapter(String song) {
        stereo = new Stereo();
        this.song = song;
    }

    public void activate() {
			stereo.play(song);
    }

    public void deactivate() {
			stereo.rememberPosition();
			stereo.off();    }
}