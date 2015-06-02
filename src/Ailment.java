public enum Ailment {

	HEALTHY, FLU, DYSENTERY, MALARIA, SMALLPOX, GANGRENE;

	private String name;
	
	static {
		HEALTHY.name = "Healthy!";
		FLU.name = "The Flu";
		DYSENTERY.name = "Dysentery";
		MALARIA.name = "Malaria";
		SMALLPOX.name = "Smallpox";
		GANGRENE.name = "Gangrene";
	}

	public String getName() {
		return name;
	}
	
	private double infectivity;
	
	static {
		HEALTHY.infectivity = 0.0;
		FLU.infectivity = 70.0;
		DYSENTERY.infectivity = 80.0;
		MALARIA.infectivity = 70.0;
		SMALLPOX.infectivity = 80.0;
		GANGRENE.infectivity = 70.0;
	}

	public double getInfectivity() {
		return infectivity;
	}
	
}