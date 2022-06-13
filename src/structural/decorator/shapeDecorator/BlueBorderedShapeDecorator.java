package structural.decorator.shapeDecorator;

import _common.shape.Shape;

public class BlueBorderedShapeDecorator extends ShapeDecorator {
    public BlueBorderedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("+ I'm with a blue border");
    }
}
