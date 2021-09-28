package home.automation;

import java.util.List;

public class SwitchFactory{

    public Switch makeSwitchWithDevices(List<Device> list) {
        return new Switch(list);
    }

}