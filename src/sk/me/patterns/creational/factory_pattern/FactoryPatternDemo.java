package sk.me.patterns.creational.factory_pattern;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        // Initialize Shape Factory
        ShapeFactory shapeFactory = new ShapeFactory();
        // Get circle and use its draw method
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();
        // Get rectangle and use its draw method
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();
        // Get square and use its draw method
        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();
    }

}
