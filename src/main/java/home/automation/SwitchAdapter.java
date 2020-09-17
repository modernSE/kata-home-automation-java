package home.automation;

import java.util.function.Consumer;

public class SwitchAdapter<T> extends Switch {

    private T legacySwitch;
    private Consumer<T> onAction;
    private Consumer<T> offAction;

    public SwitchAdapter(T legacySwitch, Consumer<T> onAction, Consumer<T> offAction) {
        this.legacySwitch = legacySwitch;
        this.onAction = onAction;
        this.offAction = offAction;
    }

    @Override
    public void on() {
        onAction.accept(legacySwitch);
    }

    @Override
    public void off() {
        offAction.accept(legacySwitch);
    }
}