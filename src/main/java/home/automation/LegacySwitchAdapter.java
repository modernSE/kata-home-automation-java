package home.automation;

import java.util.function.Consumer;

public class LegacySwitchAdapter<T> implements ToggleSwitch {

    private T legacySwitch;
    private Consumer<T> onAction;
    private Consumer<T> offAction;

    private boolean onOffState = false;

    public LegacySwitchAdapter(T legacySwitch, Consumer<T> onAction, Consumer<T> offAction) {
        this.legacySwitch = legacySwitch;
        this.onAction = onAction;
        this.offAction = offAction;
    }

    @Override
    public void toggle() {
        if (onOffState)
            offAction.accept(legacySwitch);
        else
            onAction.accept(legacySwitch);
        onOffState = !onOffState;
    }
}