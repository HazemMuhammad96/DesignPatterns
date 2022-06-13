package creational.prototype;

import _common.car.Bmw;
import _common.car.Car;
import _common.car.Toyota;
import _common.car.Volvo;

import java.util.HashMap;
import java.util.Map;

public class CarCache {

    public static final Map<String, Car> carsMap = new HashMap<>();

    private static void init() {
        carsMap.put("volvo", new Volvo());
        carsMap.put("bmw", new Bmw());
        carsMap.put("toyota", new Toyota());
    }

    public static Car cloneShape(String shapeType) {
        if (carsMap.isEmpty()) init();

        return carsMap.get(shapeType.toLowerCase()).clone();
    }
}
