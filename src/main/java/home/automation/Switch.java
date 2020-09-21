package home.automation;

public interface Switch {
    
    public void registerComponents(SwitchableComponent...components);

    public void press();
}