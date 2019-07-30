package sk.me.patterns.creational.builder;

public class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "ChickenBurger";
    }

    @Override
    public double price() {
        return 3.4d;
    }
}
