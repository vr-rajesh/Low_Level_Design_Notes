package BuilderDesingPattern;

public class BuilderMain {
    public static void main(String[] args) {
        Customer customer = new CustomerBuilder()
                .firstName("Rajesh")
                .lastName("Kumar")
                .build();

        /* here we're creating objects only with the required attributes to the builder class */

        System.out.println(customer.toString());
    }
     /*In the builder design pattern first we are setting the data into the builder object
     then we are setting it to the main objects via constructor*/

    /*The Builder design pattern is a creational design pattern used to create complex objects
    with many configuration options or parameters. It is particularly useful when an object has
    a large number of optional attributes, and you want to make the object creation process more
    readable and maintainable*/



}
