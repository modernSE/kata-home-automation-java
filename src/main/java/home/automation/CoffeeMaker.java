package home.automation;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class CoffeeMaker implements IDevice {

	private boolean on;

	String value;

	public void brew(Type type) {
		if (!on) {
			System.out.println("Turning on CoffeeMaster3000(c)");
			on = true;
		}
		System.out.println("BRRRRRRRRRRRRRRRRRRRRRRR SHHHHHHHHHHHHHHHHHHHHHHHHHHHH Drip Drip Drip...");

		//missing cast from string to type!!

		switch (type) {
		case DECAF:
			System.out.println("Using Decaf Beans.");
			break;
		case LATTE:
			System.out.println("Adding milk.");
			break;
		case ESPRESSO:
			System.out.println("That's it. No more than 3 drips for an espresso.");
		}
	}

	private boolean isOn() {
		return on;
	}

	private void doClean() {
		System.out.println("Running MasterClean3000(c) on CoffeeMaster3000");
	}


	public enum Type {
		DECAF, ESPRESSO, LATTE
	}

	@Override
	public void startDevice() {
		// nothing todo
		
	}

	@Override
	public void stopDevice() {
		if (on) {
			doClean();
			System.out.println("Shutting down CoffeeMaster3000");			
			System.out.println("CoffeeMaster3000 standing by.");
			on = false;
		}		
	}



	@Override
	public void setValue(String value) {
		// Nothing to to
		
	}

}
