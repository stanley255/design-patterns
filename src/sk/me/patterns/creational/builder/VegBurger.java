package sk.me.patterns.creational.builder;

public class VegBurger extends Burger {

    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public double price() {
        return 3.6d;
    }

}
