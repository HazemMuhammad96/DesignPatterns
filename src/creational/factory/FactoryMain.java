package creational.factory;

import _common.shape.Shape;

public class FactoryMain {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.getShape("circle");
        circle.draw();
        Shape square = factory.getShape("square");
        square.draw();
        Shape rectangle = factory.getShape("rectangle");
        rectangle.draw();

        RoundedShapeFactory roundedShapeFactory = (RoundedShapeFactory) FactoryProvider.getFactory(true);
        Shape roundedSquare = roundedShapeFactory.getShape("square");
        roundedSquare.draw();

    }
}
