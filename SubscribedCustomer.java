public class SubscribedCustomer extends Customer{

    public SubscribedCustomer(String firstName, String lastName, String email, int phoneNo, String dOB,
            String customerID, String password, boolean isSubscribed) {
        super(firstName, lastName, email, phoneNo, dOB, customerID, password, isSubscribed);
    }
    
    public void additionalDeliveryDiscount(){
        // code for adding delivery discount
    }
}
