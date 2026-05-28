package home.automation;

import java.util.List;

public class SmartHomeImpl implements SmartHomeRoutine{

    @Override
    public String DoRoutine() {
        // TODO Auto-generated method stub
        List<HomeSwitch> homeSwitches =  SwitchProvider.getHomeSwitches();
        return null;
    }
    
}
