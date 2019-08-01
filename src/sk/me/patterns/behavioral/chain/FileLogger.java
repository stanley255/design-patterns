package sk.me.patterns.behavioral.chain;

public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        super.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println(String.format("File Console::Logger: %s", message));
    }
}
