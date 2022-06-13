package structural.adapter;

import _common.shape.Circle;
import _common.shape.Shape;

public class AdapterMain {
    public static void main(String[] args) {
        Shape c = new Circle();
        c.draw();

        Text t = new Text();
        t.write();

        Shape tAdapter = new TextAdapter();
        tAdapter.draw();
    }
}
