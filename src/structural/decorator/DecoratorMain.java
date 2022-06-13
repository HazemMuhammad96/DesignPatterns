package structural.decorator;

import _common.shape.Circle;
import _common.shape.Shape;
import structural.decorator.shapeDecorator.BlueBorderedShapeDecorator;
import structural.decorator.shapeDecorator.RedBorderedShapeDecorator;

public class DecoratorMain {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();

        Shape redCircle = new RedBorderedShapeDecorator(circle);
        redCircle.draw();

        Shape blueCircle = new BlueBorderedShapeDecorator(circle);
        blueCircle.draw();

        Shape redBlueCircle = new RedBorderedShapeDecorator(new BlueBorderedShapeDecorator(circle));
        redBlueCircle.draw();

    }
}
