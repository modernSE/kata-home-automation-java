package home.automation;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class Shutter implements IDevice {


	@Override
	public void startDevice() {
		System.out.println("Closing blinds.");
		
	}

	@Override
	public void stopDevice() {
		System.out.println("Opening blinds. Avert your eyes.");		
	}

	@Override
	public void setValue(String value) {		
		
	}
}
