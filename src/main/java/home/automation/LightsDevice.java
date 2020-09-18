package home.automation;

public class LightsDevice implements SmartHomeDevice {

    Lights lights = new Lights();

    @Override
    public void turnOn() {
       lights.dimPercent(50);
       printLight();

    }

    @Override
    public void turnOff() {
       lights.off();

    }
    
    private void printLight() {
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

}