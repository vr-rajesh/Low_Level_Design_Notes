package ShallowCopy;

public class ShallowMain {
    public static void main(String[] args) {
        Address originalAddress = new Address("hyd", "Telangana");
        Person originalPerson = new Person("Rajesh",originalAddress);

        Person shallowPerson = new Person(originalPerson);

        shallowPerson.address.city = "Jodimetla";
        shallowPerson.name = "Kumar";

        System.out.println("Shallow copy "+ shallowPerson.address.city);
        System.out.println("Original Copy " + originalPerson.address.city);
    }
}
