package sk.me.patterns.creational.abstract_factory_parrent;

public class RoundedShapeFactory extends AbstractFactory {

    @Override
    Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new RoundedRectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new RoundedSquare();
        }
        return null;
    }
}
