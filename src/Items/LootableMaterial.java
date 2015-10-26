package Items;

public enum LootableMaterial implements Item {
	PISTOL;
	
	private String name;
	
	static {
		PISTOL.name = "Pistol";
	}
	
	public String getName() {
		return name;
	}

	private int worth;

	// Generate so many of each lootable material in the world.	
	static {
		PISTOL.worth = 10.0; // Temporary value
	}

	public String getWorth() {
		return worth;
	}

}
