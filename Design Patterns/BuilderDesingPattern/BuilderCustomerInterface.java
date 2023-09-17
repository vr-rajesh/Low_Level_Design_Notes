package BuilderDesingPattern;

public interface BuilderCustomerInterface {
    public BuilderCustomerInterface firstName(String firstName);
    public BuilderCustomerInterface lastName(String lastName);
    public BuilderCustomerInterface email(String email);
    public BuilderCustomerInterface phoneNumber(String phoneNumber);
    public BuilderCustomerInterface secondaryPhoneNumber(String secondaryPhoneNumber);
    public BuilderCustomerInterface secondaryEmail(String secondaryEmail);
    public BuilderCustomerInterface address(String address);

    Customer build();
}
