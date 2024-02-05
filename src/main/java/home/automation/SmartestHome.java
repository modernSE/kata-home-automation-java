package home.automation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import home.automation.Handler.AirConditioningHandler;
import home.automation.Handler.CoffeMakerHandler;
import home.automation.Handler.LightsHandler;
import home.automation.Handler.ShutterHandler;
import home.automation.Handler.SmartObjectHandler;
import home.automation.Handler.StereoHandler;

public class SmartestHome {
    
    Map<Integer, SmartObjectHandler> priorityHandlerMap = new HashMap<>();
    Sensor lightSensor = new Sensor(3);
    public SmartestHome(){
        priorityHandlerMap.put(1, new ShutterHandler());
        priorityHandlerMap.put(2, new AirConditioningHandler());
        priorityHandlerMap.put(3, new LightsHandler());
        priorityHandlerMap.put(4, new StereoHandler());
        priorityHandlerMap.put(5, new CoffeMakerHandler());

    }

    public void turnSensor(){
        lightSensor.toggle();
        if(lightSensor.isActive()){
            priorityHandlerMap.get(lightSensor.getObjectKey()).turnOn();
        }else {
            priorityHandlerMap.get(lightSensor.getObjectKey()).turnOff();
        }
    }

    public void turnOnSmartHome() {
        for(int i = 0; i < priorityHandlerMap.size(); i++){
            priorityHandlerMap.get(i+1).turnOn();
        }
    }

    public void turnOffSmartHome() {
        for(int i = 0; i < priorityHandlerMap.size(); i++){
            priorityHandlerMap.get(i+1).turnOff();
        }
    }


}
