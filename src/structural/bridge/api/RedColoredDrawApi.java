package structural.bridge.api;

public class RedColoredDrawApi implements DrawApi {
    @Override
    public void drawCircle() {
        System.out.println("I'm a red circle");
    }

    @Override
    public void drawSquare() {
        System.out.println("I'm a red square");
    }

    @Override
    public void drawRectangle() {
        System.out.println("I'm a red rectangle");
    }

}
