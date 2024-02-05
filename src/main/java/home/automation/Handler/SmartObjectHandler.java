package home.automation.Handler;

public abstract class SmartObjectHandler {
    private boolean isOn = false;

    private int priority;
    public abstract void turnOn();
    public abstract void turnOff();

public SmartObjectHandler(int priority){
    this.priority = priority;
}

    public boolean isOn(){
        return isOn;
    }

    public void switchHandler() {
        isOn = !isOn; 
    }

    public int getPriority(){
        return this.priority;
    }

}
