package home.automation;

public class LightBulbPrinter implements IDevice{

    @Override
    public void turnOn() {
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
    }

    @Override
    public void turnOff() {
    }
    
}