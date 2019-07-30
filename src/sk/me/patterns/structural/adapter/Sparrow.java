package sk.me.patterns.structural.adapter;

public class Sparrow implements Bird {

    @Override
    public void fly() {
        System.out.print("Flying");
    }

    @Override
    public void makeSound() {
        System.out.print("Chirp Chirp");
    }
}
