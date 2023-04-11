package src;
import java.util.Date;

public class PremiumUser extends User {
	private PaymentInfo paymentDetails;

	public PremiumUser(Date accountCreation, String userName, String email, PaymentInfo payDeets) {
		super(accountCreation, userName, email);
		paymentDetails = payDeets;
	}


	public PaymentInfo getPaymentDetails() {
		return this.paymentDetails;
	}

	/**
	 * 
	 * @param paymentDetails
	 */
	public void setPaymentDetails(PaymentInfo paymentDetails) {
		this.paymentDetails = paymentDetails;
	}

}