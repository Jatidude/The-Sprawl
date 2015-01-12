public enum RawMaterial implements Item {
	WOOD, STONE, METAL, HIDE;
	
	public String name;
	
	static {
		WOOD.name = "Wood";
		STONE.name = "Stone";
		METAL.name = "Metal";
		HIDE.name = "Hide";
	}

	public String getName() {
		return name;
	}
}