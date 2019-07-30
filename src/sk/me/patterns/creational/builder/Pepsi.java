package sk.me.patterns.creational.builder;

public class Pepsi extends ColdDrink {

    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public double price() {
        return 1.2d;
    }
}
