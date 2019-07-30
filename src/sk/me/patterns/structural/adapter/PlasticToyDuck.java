package sk.me.patterns.structural.adapter;

public class PlasticToyDuck implements ToyDuck {

    @Override
    public void squeak() {
        System.out.print("Squeak");
    }

}
