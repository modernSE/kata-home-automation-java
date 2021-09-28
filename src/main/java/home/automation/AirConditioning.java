package home.automation;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class AirConditioning implements IDevice{

	private String value;

	@Override
	public void startDevice() {
		System.out.println("Setting temperature to " + value);	
	}

	@Override
	public void stopDevice() {
		System.out.println("Turning off airconditioning.");		
	}

	@Override
	public void setValue(String value) {
		this.value = value;
	}
}
