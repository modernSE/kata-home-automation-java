package home.automation;

public class SwitchLightsImpl implements HomeSwitch{

    private Lights lights = new Lights();
    private boolean state = false;

    @Override
    public void SwitchState() {
        if(!state)
        {
            lights.dimPercent(50);
            state = true;
        }
        else
        {
            lights.off();
            state = false;
        }
       
    } 
}
