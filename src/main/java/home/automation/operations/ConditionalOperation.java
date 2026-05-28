package home.automation.operations;

public class ConditionalOperation implements Operation{
    private final Condition c;
    private final Operation o;

    public interface Condition {
        boolean eval();
    }

    public ConditionalOperation(Condition c, Operation o) {
        this.c = c;
        this.o = o;
    }

    @Override
    public void execute() {
        if (c.eval()) {
            o.execute();
        }
    }
}
