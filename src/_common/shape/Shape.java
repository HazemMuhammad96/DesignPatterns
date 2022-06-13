package _common.shape;

public abstract class Shape implements Cloneable {
    public abstract void draw();

    @Override
    public Shape clone(){
        try {
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
