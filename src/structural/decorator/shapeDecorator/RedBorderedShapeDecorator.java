package structural.decorator.shapeDecorator;

import _common.shape.Shape;

public class RedBorderedShapeDecorator extends ShapeDecorator {
    public RedBorderedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("+ I'm with red border");
    }
}
