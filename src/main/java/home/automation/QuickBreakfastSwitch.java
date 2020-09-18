package home.automation;

import java.util.List;

public class QuickBreakfastSwitch extends Switch {

QuickBreakfastSwitch() {
        devices = List.of(new CoffeeMakerDevice(), new ShutterDevice());

        setLinkedList(devices);
    }

}