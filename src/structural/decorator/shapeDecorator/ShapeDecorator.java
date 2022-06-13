package structural.decorator.shapeDecorator;

import _common.shape.Shape;

public abstract class ShapeDecorator extends Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public abstract void draw();
}
