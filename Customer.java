public class Customer extends User{
    private String customerID;
    private String password;
    private boolean isSubscribed;


    public Customer(String firstName, String lastName, String email, int phoneNo, String dOB, String customerID, String password, boolean isSubscribed) {
        super(firstName, lastName, email, phoneNo, dOB);
        this.customerID = customerID;
        this.password = password;
        this.isSubscribed = isSubscribed;
    }
    public boolean getIsSubscribed(){
        return this.isSubscribed;
    }
    public boolean register(){
        // code for registration should go here
        return true;
    }
    public boolean login(){
        // code for customer login should go here
        return true;
    }
    public boolean subscribe(){
        // code for customer to subscribe should go here
        return false;
    }
    

    
}
