package structural.adapter;

import _common.shape.Shape;


public class TextAdapter extends Shape {
    private Text text = new Text();

    @Override
    public void draw() {
        text.write();
    }
}
