package sk.me.patterns.creational.prototype;

public class Square extends Shape {

    public Square() {
        super.type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }

    @Override
    public Object clone() {
        Square squareClone = new Square();
        squareClone.setId(this.getId());
        return squareClone;
    }
}
