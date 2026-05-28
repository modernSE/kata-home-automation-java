package home.automation;

public class SwitchStereoImpl implements HomeSwitch{

    private Stereo stereo = new Stereo();
    private boolean state = false;

    @Override
    public void SwitchState() {
        if(!state)
        {
            stereo.play("Bob Marley");
            state = true;
        }
        else
        {
            stereo.rememberPosition();
			stereo.off();
            state = false;
        }
       
    } 
}
