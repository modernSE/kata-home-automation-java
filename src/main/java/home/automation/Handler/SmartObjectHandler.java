package home.automation.Handler;

public abstract class SmartObjectHandler {
    private boolean isOn = false;


    public abstract void turnOn();
    public abstract void turnOff();



    public boolean isOn(){
        return isOn;
    }

    public void switchHandler() {
        isOn = !isOn; 
    }


}
