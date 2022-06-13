package creational.factory;

import _common.shape.Circle;
import _common.shape.Rectangle;
import _common.shape.Shape;
import _common.shape.Square;

public class ShapeFactory extends AbstractFactory {
    public Shape getShape(String type){
        switch (type.toLowerCase()){
            case "square":
                return new Square();
            case "rectangle":
                return new Rectangle();
            case "circle":
                return new Circle();
            default:
                return null;
        }


    }
}
