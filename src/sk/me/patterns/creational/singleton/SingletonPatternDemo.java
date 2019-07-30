package sk.me.patterns.creational.singleton;

public class SingletonPatternDemo {

    public static void main(String[] args) {
        // Illegal construct
        // Compile Time Error: The constructor SingleObject() is not visible
        // SingleObject object = new SingleObject();

        // Get the only object available
        SingleObject object = SingleObject.getInstance();
        //show the message
        object.showMessage();
    }

}
