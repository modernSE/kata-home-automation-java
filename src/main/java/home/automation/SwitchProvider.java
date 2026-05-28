package home.automation;

import java.util.List;

public class SwitchProvider {
    
    private static List<HomeSwitch> homeSwitch = List.of(
        new SwitchShutterImpl(),
        new SwitchAirConditioningImpl(),
        new SwitchLightsImpl(),
        new SwitchStereoImpl(),
        new SwitchCoffeeMakerImpl()
    );

    public static List<HomeSwitch> getHomeSwitches()
    {
            return homeSwitch;
    }
}
