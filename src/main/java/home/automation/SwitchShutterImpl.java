package home.automation;

public class SwitchShutterImpl implements HomeSwitch{

    private Shutter shutter = new Shutter();
    private boolean state = false;

    @Override
    public void SwitchState() {
        if(!state)
        {
            shutter.close();
            state = true;
        }
        else
        {
            shutter.open();
            state = false;
        }
       
    } 
}
