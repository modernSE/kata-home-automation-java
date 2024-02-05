package home.automation;

import java.util.List;

public class Switch {

    private List<Switchable> things;
 
    public Switch(List<Switchable> things) {
        this.things = things;
    }

    public void on() {
        things.forEach(thing -> thing.on());
    }

    public void off() {
        things.forEach(thing -> thing.off());
    }
}
