package home.automation;

import java.util.List;

import home.automation.operations.Operation;



public class Switch {
    private final List<Operation> turnOnOperations;
    private final List<Operation> turnOffOperations;

    private boolean state = false;

    public Switch(List<Operation> turnOnOperation, List<Operation> turnOffOperation) {
        this.turnOnOperations = turnOnOperation;
        this.turnOffOperations = turnOffOperation;
    }

    public void turnOn() {
        turnOnOperations.stream().forEach((operation)->operation.execute());
    }

    public void turnOff() {
        turnOffOperations.stream().forEach((operation)->operation.execute());
    }

    public void press() {
        if (!state) {
            turnOn();
        } else {
            turnOff();
        }
        state = !state;
    }
}

