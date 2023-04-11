package src;
import java.util.Date;

public class CharacterSheet extends Character {

	private RPGSystem systemUsed;
	private String bio;
	private CharacterModel portrait;

	public String getBio() {
		return this.bio;
	}

	/**
	 * 
	 * @param bio
	 */
	public void setBio(String bio) {
		this.bio = bio;
	}

	public CharacterModel getPortrait() {
		return this.portrait;
	}

	/**
	 * 
	 * @param portrait
	 */
	public void setPortrait(CharacterModel portrait) {
		this.portrait = portrait;
	}

	public RPGSystem getSystemUsed() {
		return this.systemUsed;
	}

	/**
	 * 
	 * @param systemUsed
	 */
	public void setSystemUsed(RPGSystem systemUsed) {
		this.systemUsed = systemUsed;
	}

	/**
	 * 
	 * @param systemUsed
	 */
	public CharacterSheet(String name, Date creation, RPGSystem systemUsed) {
		super(name, creation);
		this.systemUsed = systemUsed;
		bio = "";
		portrait = null;

	}

}