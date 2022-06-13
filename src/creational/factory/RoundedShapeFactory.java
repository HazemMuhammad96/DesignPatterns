package creational.factory;

import _common.shape.*;

public class RoundedShapeFactory extends AbstractFactory {

    public Shape getShape(String type) {
        switch (type.toLowerCase()){
            case "rectangle":
                return new RoundedRectangle();
            case "square":
                return new RoundedSquare();
            default:
                return null;
        }
    }
}
