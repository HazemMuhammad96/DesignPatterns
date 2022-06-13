package creational.factory;

public class FactoryProvider {
    public static AbstractFactory getFactory(boolean rounded) {
        return rounded? new RoundedShapeFactory() : new ShapeFactory();
    }
}
