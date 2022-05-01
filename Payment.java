public class Payment {
    private String paymentType;
    private int totalAmountDue;

	public Payment(String paymentType, int totalAmountDue){
		this.paymentType = paymentType;
        this.totalAmountDue = totalAmountDue;
	}

    // objects of payment types declared below
    // creditCard creditCard = new creditCard(paymentType, nameOnCard, numberOnCard, expiryDate, cvv)
    // afterPay Afterpay = new afterpay();
    // Paypal paypal = new Paypal();

    public void makePayment(){
        // code for choosing and making payment will go here.
    }
}
