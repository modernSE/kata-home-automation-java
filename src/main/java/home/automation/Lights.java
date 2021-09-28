package home.automation;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class Lights implements IDevice{

	String value;

	@Override
	public void startDevice() {
		System.out.println("Dimming to " + value + "%");	
		
	}

	@Override
	public void stopDevice() {
		System.out.println("Lights will go out in 10 seconds.");
	}

	/**
	 * NOTE: starting from the next Software update, dimPercent will not work if the startDevice() method has not been called
	 * before.
	 **/
	@Override
	public void setValue(String value) {
		this.value = value; 			
	}
}
