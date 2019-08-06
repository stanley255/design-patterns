package sk.me.patterns.behavioral.command;

public class CommandPatternDemo {

    public static void main(String[] args) {
        // Command
        Application application = new Application();
        // Wrapping requests
        MakeApplication makeApplication = new MakeApplication(application);
        SellApplication sellApplication = new SellApplication(application);
        // Invoker
        Programmer programmer = new Programmer();
        programmer.takeOrder(makeApplication);
        programmer.takeOrder(sellApplication);
        // Invoker processed the wrapped request
        programmer.placeOrders();
    }

}
