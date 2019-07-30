package sk.me.patterns.creational.abstract_factory_parrent;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
