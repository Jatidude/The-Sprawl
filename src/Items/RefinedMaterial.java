package Items;

public enum RefinedMaterial implements Item {
	STEEL;
	
	private String name;
	
	static {
		STEEL.name = "Steel";
	}
	
	public String getName() {
		return name;
	}

}