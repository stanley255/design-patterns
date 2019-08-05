package sk.me.patterns.behavioral.state;

public class ApplicationFinish implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("The application is in the finished state of development.");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Finished state.";
    }

}
