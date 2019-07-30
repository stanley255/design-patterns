package sk.me.patterns.creational.prototype;

public class Rectangle extends Shape {

    public Rectangle() {
        super.type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }

    @Override
    public Object clone() {
        Rectangle rectangleClone = new Rectangle();
        rectangleClone.setId(this.getId());
        return rectangleClone;
    }
}
