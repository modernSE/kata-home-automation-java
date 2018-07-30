package home.automation.wrapper;

import home.automation.Stereo;

public class StereoWrapper implements DeviceWrapper{

	private Stereo stereo;
	
	public StereoWrapper() {
		stereo = new Stereo();
	}
	
	@Override
	public void startWithDefaultAction() {
		stereo.play("Bob Marley");
	}

	@Override
	public void shutDown() {
		stereo.rememberPosition();
		stereo.off();
	}

}
