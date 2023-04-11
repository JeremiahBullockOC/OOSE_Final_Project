package src;
import java.util.Date;

public class BasicUser extends User {

	public BasicUser(Date accountCreation, String userName, String email) {
		super(accountCreation, userName, email);
	}

	private int maxModels;

	public int getMaxModels() {
		return this.maxModels;
	}

	/**
	 * 
	 * @param maxModels
	 */
	public void setMaxModels(int maxModels) {
		this.maxModels = maxModels;
	}

}