package home.automation;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class CoffeeMaker {

	private boolean on;

	public void brew(Type type) {
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

	public boolean isOn() {
		return on;
	}

	public void doClean() {
		System.out.println("Running MasterClean3000(c) on CoffeeMaster3000");
	}

	/**
	 * @deprecated starting from the next Update, Coffee Makers of the CoffeeMaster300x Series will no longer support the
	 *             shutDown method. Please implement halt(int seconds) instead.
	 */
	public void shutDown() {
		if (on) {
			System.out.println("Shutting down CoffeeMaster3000");
		}
		on = false;
		System.out.println("CoffeeMaster3000 standing by.");
	}

	public enum Type {
		DECAF, ESPRESSO, LATTE
	}

}
