package home.automation;

public class ShutterWrapper implements SwitchableComponent {

    private Shutter shutter = new Shutter();
    private boolean inverted;

    public ShutterWrapper() {
        inverted = false;
    }

    public ShutterWrapper(boolean inverted) {
        this.inverted = inverted;
    }

    @Override
    public void switchOn() {
        if (inverted) {
            shutter.close();
        } else {
            shutter.open();
        }
    }

    @Override
    public void switchOff() {
        if (inverted) {
            shutter.open();
        } else {
            shutter.close();
        }
    }
    
}