package src;
import java.io.File;
import java.util.Date;

public class CharacterModel extends Character {

	private File characterModel;

	public File getCharacterModel() {
		return this.characterModel;
	}

	/**
	 * 
	 * @param characterModel
	 */
	public void setCharacterModel(File characterModel) {
		this.characterModel = characterModel;
	}

	/**
	 * 
	 * @param characterModel
	 */
	public CharacterModel(String name, Date creation, File characterModel) {
		super(name, creation);
		this.characterModel = characterModel;
	}

}