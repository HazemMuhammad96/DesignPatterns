package structural.bridge;

import structural.bridge.api.BlueColoredDrawApi;
import structural.bridge.api.DrawApi;
import structural.bridge.api.RedColoredDrawApi;
import structural.bridge.shape.BridgedCircle;
import structural.bridge.shape.BridgedShape;

public class BridgeMain {
    public static void main(String[] args) {
        DrawApi redApi = new RedColoredDrawApi();
        BridgedShape redCircle = new BridgedCircle(redApi);
        redCircle.draw();

        DrawApi blueApi = new BlueColoredDrawApi();
        BridgedShape blueCircle = new BridgedCircle(blueApi);
        blueCircle.draw();
    }
}

