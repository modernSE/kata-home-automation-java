package home.automation;

import org.graalvm.compiler.core.common.type.ArithmeticOpTable.UnaryOp.Abs;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */

/**
 * Starting from the next software update, it would be nice, if the source of music were selectable by the user.
 */
public class Stereo extends AbstractHomeComponent implements Stoppable {
	@Override
	public void changeState(String s) {
		System.out.println("Loading Spotify....");
		System.out.println("Get up, stand up... Stand up for your rights!");
	}

	@Override
	public void stop() {
		rememberPosition();
		off();
	}

	private void rememberPosition() {
		System.out.println("Play will continue from 'I didn't shoot the deputy.'");
	}

	private void off() {
		System.out.println("Stereo Shutting down.");
	}

}
