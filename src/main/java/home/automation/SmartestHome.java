package home.automation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import home.automation.Handler.AirConditioningHandler;
import home.automation.Handler.CoffeMakerHandler;
import home.automation.Handler.LightsHandler;
import home.automation.Handler.ShutterHandler;
import home.automation.Handler.SmartObjectHandler;
import home.automation.Handler.StereoHandler;

public class SmartestHome {
    
    List<SmartObjectHandler> handlers = new ArrayList<>();
    public SmartestHome(){
        var list = List.of(new ShutterHandler(1), new AirConditioningHandler(2), new LightsHandler(3),
         new StereoHandler(4), new CoffeMakerHandler(5));
        handlers.addAll(list);
         Collections.sort(handlers, (h1, h2) ->{
            return h1.getPriority() - h2.getPriority();
         });
    }

    public void turnOnSmartHome() {
        for(SmartObjectHandler handler: handlers){
            handler.turnOn();
        }
    }

    public void turnOffSmartHome() {
        for(SmartObjectHandler handler: handlers){
            handler.turnOff();
        }
    }


}
