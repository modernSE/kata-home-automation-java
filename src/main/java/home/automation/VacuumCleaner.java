package home.automation;

public class VacuumCleaner extends Switch {

    @Override
    protected void on() {
         System.out.println("Cleaning the room!");

    }

    @Override
    protected void off() {
        System.out.println("Done cleaning, returning to base :D");
    }
    
}
