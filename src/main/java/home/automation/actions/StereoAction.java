package home.automation.actions;

import home.automation.Stereo;

public class StereoAction implements AutomationAction{

	private Stereo stereo;
	
	private String song;

	public StereoAction(String song) {
		stereo = new Stereo();
		this.song = song;
	}
	
	@Override
	public void turnOn() {
		stereo.play(song);
	}

	@Override
	public void turnOff() {
		stereo.rememberPosition();
		stereo.off();
	}

}
