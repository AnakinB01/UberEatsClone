public class afterPay extends Payment{
    private String reciever;
    private Double amount;

    public afterPay(String paymentType,int amount, String reciever, double amountPaidUsingafterPay){
        super(paymentType, amount);
        this.reciever = reciever;
        this.amount = amountPaidUsingafterPay;
    }
    @Override
    public void makePayment(){

	}
}
