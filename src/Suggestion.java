package src;
public class Suggestion {

	private SuggestionCategory category;
	private String suggestion;
	private java.util.Date dateSuggested;

	public SuggestionCategory getCategory() {
		return this.category;
	}

	/**
	 * 
	 * @param category
	 */
	public void setCategory(SuggestionCategory category) {
		this.category = category;
	}

	public String getSuggestion() {
		return this.suggestion;
	}

	/**
	 * 
	 * @param suggestion
	 */
	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}

	public java.util.Date getDateSuggested() {
		return this.dateSuggested;
	}

	/**
	 * 
	 * @param dateSuggested
	 */
	public void setDateSuggested(java.util.Date dateSuggested) {
		this.dateSuggested = dateSuggested;
	}

	/**
	 * 
	 * @param category
	 * @param suggestion
	 * @param dateSuggested
	 */
	public Suggestion(SuggestionCategory category, String suggestion, java.util.Date dateSuggested) {
		// TODO - implement Suggestion.Suggestion
		throw new UnsupportedOperationException();
	}

}