package DeepCopyConstructor;

public class Address {
    String city;
    String state;

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    // deep copy address
    // in the deep copy we are creating a new object and creating a new instance of the current
    //object so when we do the modification on the deep copy object then it will not modify the current object
    public Address(Address address) {
        this.city = address.city;
        this.state = address.state;
    }
}
