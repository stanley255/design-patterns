package sk.me.patterns.behavioral.observer;

public class ObserverPatternDemo {

    public static void main(String[] args) {
        Programmer programmer = new Programmer();

        new CEO(programmer);
        new Manager(programmer);
        new LeadProgrammer(programmer);

        System.out.println("Programmer successfully did his job!");
        programmer.setState("Successful");
        System.out.println("Programmer failed his new assignment.");
        programmer.setState("Failed");
    }

}
