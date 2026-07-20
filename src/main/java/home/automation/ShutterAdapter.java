package home.automation;

public class ShutterAdapter implements Component {

    private final Shutter shutter;

    public ShutterAdapter(Shutter shutter) {
        this.shutter = shutter;
    }

    @Override
    public void whenOn() {
        shutter.open();
    }

    @Override
    public void whenOff() {
        shutter.close();
    }

}
