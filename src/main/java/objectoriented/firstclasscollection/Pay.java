package objectoriented.firstclasscollection;

public class Pay {

	private final PayType payType;
	private final int amount;

	public Pay(PayType payType, int amount) {
		this.payType = payType;
		this.amount = amount;
	}

	public PayType getPayType() {
		return payType;
	}

	public int getAmount() {
		return amount;
	}
}
