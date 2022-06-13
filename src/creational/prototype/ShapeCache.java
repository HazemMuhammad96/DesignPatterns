package creational.prototype;

import _common.shape.Circle;
import _common.shape.Rectangle;
import _common.shape.Shape;
import _common.shape.Square;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {
    private static final Map<String, Shape> shapeCache  = new HashMap<>();

    public static void init(){
        shapeCache.put("circle", new Circle());
        shapeCache.put("rectangle", new Rectangle());
        shapeCache.put("square", new Square());
    }

    public static Shape getShape(String type) {
        if(shapeCache.isEmpty())
            init();

        Shape cachedShape = shapeCache.get(type.toLowerCase());
        return cachedShape.clone();
    }
}
