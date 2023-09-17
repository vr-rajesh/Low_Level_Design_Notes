package BuilderDesingPattern;

public class CustomerBuilder implements BuilderCustomerInterface{
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String secondaryPhoneNumber;
    private String secondaryEmail;
    private String address;
    @Override
    public BuilderCustomerInterface firstName(String firstName) {
        this.firstName = firstName;
        return this;
        /*Method Chaining: By returning this, you allow multiple method calls to be chained together
        on the same builder instance. This means that after setting firstname using firstname,
        you can immediately call another method on the same builder object without needing to
        reference it again explicitly. This leads to more concise and readable code,
        especially when configuring an object with numerous attributes.*/
    }

    @Override
    public BuilderCustomerInterface lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public BuilderCustomerInterface email(String email) {
        this.email = email;
        return this;
    }

    @Override
    public BuilderCustomerInterface phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    @Override
    public BuilderCustomerInterface secondaryPhoneNumber(String secondaryPhoneNumber) {
        this.secondaryPhoneNumber = secondaryPhoneNumber;
        return this;
    }

    @Override
    public BuilderCustomerInterface secondaryEmail(String secondaryEmail) {
        this.secondaryEmail = secondaryEmail;
        return this;
    }

    @Override
    public BuilderCustomerInterface address(String address) {
        this.address = address;
        return this;
    }
    public Customer build() {
        return new Customer(this);
        // passing the final current instance of the builder to the main customer constructor
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSecondaryPhoneNumber() {
        return secondaryPhoneNumber;
    }

    public String getSecondaryEmail() {
        return secondaryEmail;
    }

    public String getAddress() {
        return address;
    }
}
