package DeepCopyConstructor;

public class Person {
    String name;
    Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    // deep copy with the new keyword
    public Person(Person person){
        this.name = person.name;
        this.address = new Address(person.address);
    }
}
