package _common.car;

public abstract class Car implements Cloneable {
    public int maxSpeed;
    public String color;
    public boolean isAuto;


    public void driveForward() {
    }

    public void driveBackward() {
    }

    @Override
    public Car clone()  {
        try {
            return (Car) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
