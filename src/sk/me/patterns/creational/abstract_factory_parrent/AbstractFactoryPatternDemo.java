package sk.me.patterns.creational.abstract_factory_parrent;

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        // Get Shape Factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        // Get rectangle and use its draw method
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();
        // Get square and use its draw method
        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();
        // Get Rounded Shape Factory
        AbstractFactory roundedShapeFactory = FactoryProducer.getFactory(true);
        // Get rounded rectangle and use its draw method
        Shape roundedRectangle = roundedShapeFactory.getShape("RECTANGLE");
        roundedRectangle.draw();
        // Get rounded square and use its draw method
        Shape roundedSquare = roundedShapeFactory.getShape("SQUARE");
        roundedSquare.draw();
    }

}
