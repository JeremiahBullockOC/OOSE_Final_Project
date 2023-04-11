package src;
public class Character {

	private String characterName;
	private java.util.Date creationDate;
	private java.util.Date updateDate;

	

	public String getCharacterName() {
		return this.characterName;
	}

	/**
	 * 
	 * @param characterName
	 */
	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

	public java.util.Date getCreationDate() {
		return this.creationDate;
	}

	/**
	 * 
	 * @param creationDate
	 */
	public void setCreationDate(java.util.Date creationDate) {
		this.creationDate = creationDate;
	}

	public java.util.Date getUpdateDate() {
		return this.updateDate;
	}

	/**
	 * 
	 * @param updateDate
	 */
	public void setUpdateDate(java.util.Date updateDate) {
		this.updateDate = updateDate;
	}

	/**
	 * 
	 * @param characterName
	 * @param creationDate
	 */
	public Character(String characterName, java.util.Date creationDate) {
		this.characterName = characterName;
		this.creationDate = creationDate;
	}

}