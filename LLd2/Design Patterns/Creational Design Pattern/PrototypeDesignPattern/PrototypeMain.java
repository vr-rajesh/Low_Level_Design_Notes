package PrototypeDesignPattern;

public class PrototypeMain {
    public static void main(String[] args) {

        ShapeCircle circle = new ShapeCircle(5);
        ShapeSquare square = new ShapeSquare(10);

        IShapePrototype circle1 = circle.clone();
        IShapePrototype circle2 = circle.clone();

        IShapePrototype square1 = square.clone();
        IShapePrototype square2 = square.clone();

        circle1.draw();
        circle2.draw();
        square1.draw();
        square2.draw();

        /*we have defined a ShapePrototype interface that includes the clone method
        for creating copies of shape objects. Then, we have concrete implementations
        of the Circle and Square classes that implement the ShapePrototype interface.
        Finally, in the main method, we create instances of shapes by cloning the prototypes
        and then demonstrate how the cloned instances can be modified and used.*/

    }
}

/*    The Prototype pattern is a creational design pattern that allows
    you to create new objects by copying an existing object, known as the prototype

        Prototype design pattern is used when the Object creation is a costly affair and
        requires a lot of time and resources, and you have a similar object already existing.
        Prototype pattern provides a mechanism to copy the original object to a new object
        and then modify it according to our needs*/
