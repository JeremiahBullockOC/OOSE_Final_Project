package src;
public class AvatarAppInterface {

	private String avatarAppURL;

	public String getAvatarAppURL() {
		return this.avatarAppURL;
	}

	/**
	 * 
	 * @param avatarAppURL
	 */
	public void setAvatarAppURL(String avatarAppURL) {
		this.avatarAppURL = avatarAppURL;
	}

	public void connectToAvatarApp() {
		// TODO - implement AvatarAppInterface.connectToAvatarApp
		throw new UnsupportedOperationException();
	}

	public CharacterModel downloadAvatar() {
		// TODO - implement AvatarAppInterface.downloadAvatar
		throw new UnsupportedOperationException();
	}

}