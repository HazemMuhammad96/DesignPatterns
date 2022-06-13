package structural.bridge.shape;

import _common.shape.Shape;
import structural.bridge.api.DrawApi;

public abstract class BridgedShape extends Shape {
    protected DrawApi drawApi;

    public BridgedShape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    @Override
    public abstract void draw();
}
