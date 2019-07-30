package sk.me.patterns.creational.abstract_factory_parrent;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean rounded) {
        if (rounded) {
            return new RoundedShapeFactory();
        }
        return new ShapeFactory();
    }
}
