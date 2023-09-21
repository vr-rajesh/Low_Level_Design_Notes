package ShallowCopy;

public class Person {
    String name;
    Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    // shallow copy
    // here we are not creating a new instance and this object will point to the current object
    // if any modification done on the shallow object it will reflect in the current object
    public Person(Person person){
        this.name = person.name;
        this.address = person.address;
    }
}
