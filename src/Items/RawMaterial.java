package Items;
public enum RawMaterial implements Item {
	WOOD, STONE, METAL, HIDE;
	
	public String name;
	
	static {
		WOOD.name = "Wood Pile";
		STONE.name = "Stone Pile";
		METAL.name = "Metal Lumps";
		HIDE.name = "Hide";
	}

	public String getName() {
		return name;
	}
}