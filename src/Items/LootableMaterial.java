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

}
