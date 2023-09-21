package RegistryDesignPattern;

public class StudentMain
{
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        studentRegistry.registerStudent("100",new Student("100","Rajesh",24));
        studentRegistry.registerStudent("101",new Student("101","Rahul",25));
        //creating objects and storing in the hashmap for  future use

        Student student1 = studentRegistry.getRegisteredStudent("100");
        Student student2 = studentRegistry.getRegisteredStudent("101");
        // retrieving the objects from the register hashmap with unique attribute

        if(student1 != null){
            System.out.println(student1);
        }
        if(student2 != null){
            System.out.println(student2);
        }

    }
}

/*Registry design Pattern is a creational design pattern used as a central repo for storing the
objects. We can retrieve the objects from the repo with the help of unique key or name in the student example
we have student ID

We create and store the objets in the HashMap with unique key class
We create the objets when we actually need it

The Registry Design Pattern is a creational design pattern that provides a centralized point for managing and
accessing instances of classes. It acts as a registry or a repository where objects can be registered and then
looked up later by their unique identifiers. This pattern is often used when you want to maintain a global set
of objects or services that can be accessed throughout an application.
*/

