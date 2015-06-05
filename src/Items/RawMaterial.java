package Items;

public enum RawMaterial implements Item {
	LUMBER, STONE;
	
	private String name;
	
	static {
		LUMBER.name = "Lumber";
		STONE.name = "Stone";
	}
	
	public String getName() {
		return name;
	}
	
}