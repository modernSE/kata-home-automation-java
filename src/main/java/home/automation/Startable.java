package home.automation;

public interface Startable<T> {
    public void changeState(T... newStates );
}
