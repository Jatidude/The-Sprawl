package Items;

public enum RawMaterial implements Item {
	LUMBER, STONES;
	
	private String name;
	
	static {
		LUMBER.name = "Lumber";
		STONES.name = "Stones";
	}
	
	public String getName() {
		return name;
	}

}