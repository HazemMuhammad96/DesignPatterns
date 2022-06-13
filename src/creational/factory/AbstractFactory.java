package creational.factory;

import _common.shape.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShape(String type);
}
