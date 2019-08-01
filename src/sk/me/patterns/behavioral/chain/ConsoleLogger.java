package sk.me.patterns.behavioral.chain;

public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        super.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println(String.format("Standard Console::Logger: %s", message));
    }
}
