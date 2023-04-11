package src;
public class User {

	private java.util.Date accountCreation;
	private String userName;
	private String email;
	private PaymentInfo paymentDetails;
	private String passwordHash;

	public java.util.Date getAccountCreation() {
		return this.accountCreation;
	}

	/**
	 * 
	 * @param accountCreation
	 */
	public void setAccountCreation(java.util.Date accountCreation) {
		this.accountCreation = accountCreation;
	}

	public String getUserName() {
		return this.userName;
	}

	/**
	 * 
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return this.email;
	}

	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
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

	/**
	 * 
	 * @param accountCreation
	 * @param userName
	 * @param email
	 */
	public User(java.util.Date accountCreation, String userName, String email) {
		// TODO - implement User.User
		throw new UnsupportedOperationException();
	}

	public String getPasswordHash() {
		return this.passwordHash;
	}

	/**
	 * 
	 * @param passwordHash
	 */
	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

}