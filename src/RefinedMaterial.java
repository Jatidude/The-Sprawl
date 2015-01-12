
public enum RefinedMaterial implements Item {
	LUMBER, COPPER, TIN, IRON, GOLD, STEEL, COAL, GRAVEL;
	
	public String name;
	
	static {
		LUMBER.name = "Lumber";
		COPPER.name = "Copper Ingot";
		TIN.name = "Tin Ingot";
		IRON.name = "Iron Ingot";
		GOLD.name = "Gold Ingot";
		STEEL.name = "Steel Ingot";
		COAL.name = "Coal Lump";
		GRAVEL.name = "Gravel Bag";
	}

	public String getName() {
		return name;
	}
}
