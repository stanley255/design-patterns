package sk.me.patterns.behavioral.state;

public class ApplicationStart implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("The application is in the starting state of development.");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Starting state.";
    }

}
