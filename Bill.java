
public class Bill {
	
	private int billID;
	private String billingDetail;
	private String billingAdd;
	
	public Bill(int billID, String billingDetail, String billingAdd) {
		this.billID = billID;
		this.billingDetail = billingDetail;
		this.billingAdd = billingAdd;
	}

	public int getBillID() {
		return billID;
	}

	public String getBillingDetail() {
		return billingDetail;
	}

	public String getBillingAdd() {
		return billingAdd;
	}

	public void acceptBill() {}

	public void rejectBill() {}

}
