package BuilderDesingPattern;

public class Customer {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String secondaryPhoneNumber;
    private String secondaryEmail;
    private String address;

    public Customer(CustomerBuilder customerBuilder) {
        this.firstName = customerBuilder.getFirstName();
        this.lastName = customerBuilder.getLastName();
        this.email = customerBuilder.getEmail();
        this.phoneNumber = customerBuilder.getPhoneNumber();
        this.secondaryPhoneNumber = customerBuilder.getSecondaryPhoneNumber();
        this.secondaryEmail = customerBuilder.getSecondaryEmail();
        this.address = customerBuilder.getAddress();

        /*Getting values from the builder class and setting it to the main class object via constructor
        here we are only setting the required attributes from the builder class
        */
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setSecondaryPhoneNumber(String secondaryPhoneNumber) {
        this.secondaryPhoneNumber = secondaryPhoneNumber;
    }

    public void setSecondaryEmail(String secondaryEmail) {
        this.secondaryEmail = secondaryEmail;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", secondaryPhoneNumber='" + secondaryPhoneNumber + '\'' +
                ", secondaryEmail='" + secondaryEmail + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
