public class Paypal extends Payment{
    private String email;
    private int phoneNo;


    public Paypal(String paymentType,int amount, String email, int phoneNo){
        super(paymentType, amount);
        this.email = email;
        this.phoneNo = phoneNo;

    }

    @Override
    public void makePayment(){

	}
}
