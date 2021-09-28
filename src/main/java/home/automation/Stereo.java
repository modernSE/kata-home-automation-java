package home.automation;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */

/**
 * Starting from the next software update, it would be nice, if the source of music were selectable by the user.
 */
public class Stereo implements IDevice{

	String value;

	private void rememberPosition() {
		System.out.println("Play will continue from 'I didn't shoot the deputy.'");
	}

	@Override
	public void startDevice() {
		System.out.println("Loading Spotify....");
		System.out.println("Get up, stand up... Stand up for your rights!");
	}

	@Override
	public void stopDevice() {
		rememberPosition();
		System.out.println("Stereo Shutting down.");
	}

	@Override
	public void setValue(String value) {
		this.value = value;		
	}

}
