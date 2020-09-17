package home.automation;

abstract class Switch implements ToggleSwitch {

    private boolean onOffState = false;

    @Override
    public void toggle() {
        if (onOffState)
            off();
        else
            on();
        onOffState = !onOffState;
    }

    protected abstract void on();
    protected abstract void off();
}
