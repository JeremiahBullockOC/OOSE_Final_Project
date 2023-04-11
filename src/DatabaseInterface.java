package src;
public class DatabaseInterface {

	private String databaseURL;

	public void connectWithDatabase() {
		// TODO - implement DatabaseInterface.connectWithDatabase
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param username
	 * @param password
	 */
	public boolean checkPassword(String username, String password) {
		// TODO - implement DatabaseInterface.checkPassword
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param username
	 * @param characterName
	 * @param characterModel
	 */
	public boolean saveCharacter(String username, String characterName, Character characterModel) {
		// TODO - implement DatabaseInterface.saveCharacter
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param username
	 * @param password
	 */
	public boolean updatePassword(String username, String password) {
		// TODO - implement DatabaseInterface.updatePassword
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param username
	 * @param characterName
	 */
	public Character retrieveCharacter(String username, String characterName) {
		// TODO - implement DatabaseInterface.retrieveCharacter
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param username
	 * @param characterName
	 * @param characterModel
	 */
	public boolean deleteCharacter(String username, String characterName, Character characterModel) {
		// TODO - implement DatabaseInterface.deleteCharacter
		throw new UnsupportedOperationException();
	}

	public String getDatabaseURL() {
		return this.databaseURL;
	}

	/**
	 * 
	 * @param databaseURL
	 */
	public void setDatabaseURL(String databaseURL) {
		this.databaseURL = databaseURL;
	}

	/**
	 * 
	 * @param searchString
	 */
	public java.util.ArrayList<HelpArticle> getHelpArticle(String searchString) {
		// TODO - implement DatabaseInterface.getHelpArticle
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param suggestion
	 */
	public boolean giveSuggestion(Suggestion suggestion) {
		// TODO - implement DatabaseInterface.giveSuggestion
		throw new UnsupportedOperationException();
	}

}