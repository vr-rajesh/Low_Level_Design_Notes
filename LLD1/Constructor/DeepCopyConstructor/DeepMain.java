package DeepCopyConstructor;

public class DeepMain {
    public static void main(String[] args) {
        Address address = new Address("Hyd","Telangana");
        Person person = new Person("Rajesh", address);

        Person deepAddress = new Person(person);

        deepAddress.address.state = "AP";
        System.out.println(deepAddress.address.state);
        System.out.println(person.address.state);
    }





}
