package structural.bridge.shape;

import structural.bridge.api.DrawApi;

public class BridgedCircle extends BridgedShape {

    public BridgedCircle(DrawApi drawApi) {
        super(drawApi);
    }

    @Override
    public void draw() {
        drawApi.drawCircle();
    }
}
