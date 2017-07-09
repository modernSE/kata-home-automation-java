package home.automation;

/**
 * Created by Ferdinand.Szekeresch on 11.05.2017.
 */
public class MotionDetector extends Switch {

	public void onMotionDetected() {
		System.out.println("Motion detected! Who goes there?");
		switchOn();
	}

	public void onIdle() {
		switchOff();
	}

}
