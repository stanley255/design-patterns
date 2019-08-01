package sk.me.patterns.behavioral.chain;

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        super.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println(String.format("Error Console::Logger: %s", message));
    }
}
