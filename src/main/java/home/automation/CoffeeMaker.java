package home.automation;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class CoffeeMaker implements IAutomationDevice {

	private boolean on;

	private void brew(Type type) {
		if (!on) {
			System.out.println("Turning on CoffeeMaster3000(c)");
			on = true;
		}
		System.out.println("BRRRRRRRRRRRRRRRRRRRRRRR SHHHHHHHHHHHHHHHHHHHHHHHHHHHH Drip Drip Drip...");
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
	@Override
	public boolean isOn() {
		return on;
	}

	private void doClean() {
		System.out.println("Running MasterClean3000(c) on CoffeeMaster3000");
	}

	/**
	 * @deprecated starting from the next Update, Coffee Makers of the CoffeeMaster300x Series will no longer support the
	 *             shutDown method. Please implement halt(int seconds) instead.
	 */
	private void shutDown() {
		if (on) {
			System.out.println("Shutting down CoffeeMaster3000");
		}
		on = false;
		System.out.println("CoffeeMaster3000 standing by.");
	}

	private enum Type {
		DECAF, ESPRESSO, LATTE
	}

	@Override
	public void turnOn() {
		brew(CoffeeMaker.Type.DECAF);
		
	}

	@Override
	public void turnOff() {
		if(isOn()) {		
			doClean();
			shutDown();
		}
		
		
	}

}
