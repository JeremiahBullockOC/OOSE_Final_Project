package src;
public class PaymentInfo {

	private String name;
	private String streetAddress;
	private String town;
	private int zipcode;
	private String state;
	private int[] cardNumber;
	private int expMonth;
	private int expYear;
	private int cvvCode;

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String getStreetAddress() {
		return this.streetAddress;
	}

	/**
	 * 
	 * @param streetAddress
	 */
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getTown() {
		return this.town;
	}

	/**
	 * 
	 * @param town
	 */
	public void setTown(String town) {
		this.town = town;
	}

	public int getZipcode() {
		return this.zipcode;
	}

	/**
	 * 
	 * @param zipcode
	 */
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String getState() {
		return this.state;
	}

	/**
	 * 
	 * @param state
	 */
	public void setState(String state) {
		this.state = state;
	}

	public int[] getCardNumber() {
		return this.cardNumber;
	}

	/**
	 * 
	 * @param cardNumber
	 */
	public void setCardNumber(int[] cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getExpMonth() {
		return this.expMonth;
	}

	/**
	 * 
	 * @param expMonth
	 */
	public void setExpMonth(int expMonth) {
		this.expMonth = expMonth;
	}

	public int getExpYear() {
		return this.expYear;
	}

	/**
	 * 
	 * @param expYear
	 */
	public void setExpYear(int expYear) {
		this.expYear = expYear;
	}

	public int getCvvCode() {
		return this.cvvCode;
	}

	/**
	 * 
	 * @param cvvCode
	 */
	public void setCvvCode(int cvvCode) {
		this.cvvCode = cvvCode;
	}

}