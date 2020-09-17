package home.automation;

public class StaircaseLights extends Switch {

    @Override
    protected void on() {
        System.out.println("Turning on Staircase lights");

    }

    @Override
    protected void off() {
        System.out.println("Turning oof staircase lights!");

    }
   
}
