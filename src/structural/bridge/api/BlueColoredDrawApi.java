package structural.bridge.api;

public class BlueColoredDrawApi implements DrawApi {
    @Override
    public void drawCircle() {
        System.out.println("I'm a blue circle");
    }

    @Override
    public void drawSquare() {
        System.out.println("I'm a blue square");
    }

    @Override
    public void drawRectangle() {
        System.out.println("I'm a blue rectangle");
    }
}
