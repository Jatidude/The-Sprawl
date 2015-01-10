public enum Ailment {

	HEALTHY, FLU, DYSENTERY, MALARIA, PLAGUE, SMALLPOX;

	private double infectivity;
	
	static {
		HEALTHY.infectivity = 0.0;
		FLU.infectivity = 70.0;
		DYSENTERY.infectivity = 80.0;
		MALARIA.infectivity = 70.0;
		PLAGUE.infectivity = 90.0;
		SMALLPOX.infectivity = 80.0;
	}
	public double getInfectivity(){
		return infectivity;
	}
	
	private String name;
	
	static {
		HEALTHY.name = "no diseases";
		FLU.name = "the Flu";
		DYSENTERY.name = "the bloody Flux";
		MALARIA.name = "the ague";
		PLAGUE.name = "the Black Plague";
		SMALLPOX.name = "the Red Plague";
	}
	public String getName(){
		return name;
	}
	
}