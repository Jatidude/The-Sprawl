public enum Ailment {

	HEALTHY, FLU, DYSENTERY, MALARIA, PLAGUE, SMALLPOX, GANGRENE;

	private double infectivity;
	
	static {
		HEALTHY.infectivity = 0.0;
		FLU.infectivity = 70.0;
		DYSENTERY.infectivity = 80.0;
		MALARIA.infectivity = 70.0;
		PLAGUE.infectivity = 90.0;
		SMALLPOX.infectivity = 80.0;
		GANGRENE.infectivity = 70.0;
	}

	public double getInfectivity(){
		return infectivity;
	}
	
	private String name;
	
	static {
		HEALTHY.name = "Healthy!";
		FLU.name = "The Flu";
		DYSENTERY.name = "the bloody Flux";
		MALARIA.name = "the ague";
		PLAGUE.name = "the Black Plague";
		SMALLPOX.name = "the Red Plague";
		GANGRENE.name = "Ergotism";
	}

	public String getName(){
		return name;
	}
	
}