public enum Sex {
	MALE, FEMALE;
	
	private String pronoun;
	
	static {
		MALE.pronoun = "HIM";
		FEMALE.pronoun = "HER";
	}
	
	public String getPronoun() {
		return pronoun;
	}
	
}