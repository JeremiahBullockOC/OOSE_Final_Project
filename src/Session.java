package src;
public class Session {

	private User sessionUser;
	private Integer sessionID;
	private DatabaseInterface databaseConnection;

	public User getSessionUser() {
		return this.sessionUser;
	}

	/**
	 * 
	 * @param sessionUser
	 */
	public void setSessionUser(User sessionUser) {
		this.sessionUser = sessionUser;
	}

	public Integer getSessionID() {
		return this.sessionID;
	}

	/**
	 * 
	 * @param sessionID
	 */
	public void setSessionID(Integer sessionID) {
		this.sessionID = sessionID;
	}

	public void runSession() {
		// TODO - implement Session.runSession
		throw new UnsupportedOperationException();
	}

}