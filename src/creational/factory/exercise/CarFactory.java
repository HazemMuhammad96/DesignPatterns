package creational.factory.exercise;

import _common.car.Bmw;
import _common.car.Car;
import _common.car.Toyota;
import _common.car.Volvo;

public class CarFactory {

    public Car getCar(String type) {
        switch (type.toLowerCase()){
            case "bmw":
                return new Bmw();
            case "volvo":
                return new Volvo();
            case "toyota":
                return new Toyota();
            default:
                return null;
        }
    }
}
