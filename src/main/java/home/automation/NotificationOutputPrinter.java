package home.automation;

public class NotificationOutputPrinter {
    
    public void beforeOn(){
        System.out.println("BIG OLD SWITCH PRESSED.\n\n");
    }
    public void afterOn(){
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
    public void beforeOff(){
        // NOOP
    }
    public void afterOff(){
        // NOOP
    }
}
