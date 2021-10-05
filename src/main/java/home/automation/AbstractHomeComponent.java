package home.automation;

import org.hamcrest.core.IsInstanceOf;

public abstract class AbstractHomeComponent {
    private boolean isOn = false;
    private String state; 

    public abstract void changeState(String newStates );
    public void stop() {

    }
    public void toggle() {
        isOn = !isOn;
        if (isOn) {
            changeState(state);
        } else {
            this.stop();
        }
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
}
