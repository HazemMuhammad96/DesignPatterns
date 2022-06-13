package creational.prototype;

import _common.shape.Shape;

public class PrototypeMain {
    public static void main(String[] args) {
        Shape c = ShapeCache.getShape("Circle");
        c.draw();

        Shape r = ShapeCache.getShape("Rectangle");
        r.draw();
    }
}
