package sk.me.patterns.structural.adapter;

public class BirdAdapter implements ToyDuck {

    public Bird bird;

    public BirdAdapter(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void squeak() {
        // Translate the methods appropriately
        this.bird.makeSound();
    }

}
