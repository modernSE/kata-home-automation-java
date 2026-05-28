package home.automation.operations;

public class PrintingOperation implements Operation{
    private final String content;

    public PrintingOperation(String content) {
        this.content = content;
    }

    @Override
    public void execute() {
        System.out.println(content);
    }
    
}
