package sk.me.patterns.creational.prototype;

public class Circle extends Shape {

    public Circle() {
        super.type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }

    @Override
    public Object clone() {
        Circle circleClone = new Circle();
        circleClone.setId(this.getId());
        return circleClone;
    }
}
