package home.automation;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class BigOldMasterSwitch extends Switch {

	public void press() {
		switch (state) {
		case OFF:
			System.out.println("BIG OLD SWITCH PRESSED.\n\n");
			switchOn();
			StringBuffer b = new StringBuffer();
			b.append("         |\n");
			b.append(" \\     _____     /\n");
			b.append("     /       \\\n");
			b.append("    (         )\n");
			b.append("-   ( ))))))) )   -\n");
			b.append("     \\ \\   / /\n");
			b.append("      \\|___|/\n");
			b.append("  /    |___|    \\\n");
			b.append("       |___| prs\n");
			b.append("       |___|\n");
			System.out.println(b.toString());
			break;
		case ON:
			switchOff();
			break;
		default:
			switchOff();
		}
	}
}
