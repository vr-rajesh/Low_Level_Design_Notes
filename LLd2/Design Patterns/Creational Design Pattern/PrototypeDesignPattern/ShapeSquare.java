package PrototypeDesignPattern;

public class ShapeSquare implements IShapePrototype{
    private final int side;

    public ShapeSquare(int side) {
        this.side = side;
    }

    @Override
    public IShapePrototype clone() {
        return new ShapeSquare(this.side);
        // copy constructor
    }

    @Override
    public void draw() {
        System.out.println("Square Side :" +side);
    }
}
