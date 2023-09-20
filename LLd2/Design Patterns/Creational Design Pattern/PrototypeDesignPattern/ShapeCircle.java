package PrototypeDesignPattern;

public class ShapeCircle implements IShapePrototype{

    int radius;

    public ShapeCircle(int radius) {
        this.radius = radius;
    }

    @Override
    public IShapePrototype clone() {
        return new ShapeCircle(this.radius);
        // copy constructor
    }

    @Override
    public void draw() {
        System.out.println("Circle radius :" +radius);
    }
}
