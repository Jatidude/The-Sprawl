import java.util.ArrayList;

public class Colony {
	
	private String name;
	public ArrayList<Colonist> colonists = new ArrayList<Colonist>();
	public ArryList<Object> stock = new ArrayList<Object>();
	private int population;
	private int wealth;
	private int happiness;
	
	public Colony() {
		this.name = "The Colony";
		this.population = 0;
		this.wealth = 0;
		this.happiness = population;
	}
	
	public Colony(String n, int p) {
		this.name = n;
		this.population = p;
		for(int i=1; i<=p; i++) {
			colonists.add(new Colonist());
		}
		this.happiness = calculateHappiness();
		this.wealth = calculateWealth();
		
	}
	
	// make a calculate happiness formula that takes into account safety (in numbers), defensive, food amount, power, etc.
	public int calculateHappiness() {
		happiness = population/(1);
		return happiness;
	}
	
	// Wealth will be calculated by tallying up the things found in the colony that they "loot" from their surroundings.
	// WEATLTH = POPULATION / (VALUE OF INVENTORY + VALUE OF RESOURCES + VALUE OF OCCUPATIONS)
	public int calculateWealth() {
		wealth = population/(1);
		return wealth;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPopulation() {
		return this.population;
	}
	
	public int getHappiness() {
		return this.happiness;
	}
	
	public int getWealth() {
		return this.wealth;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPopulation(int population) {
		this.population = population;
	}
	
	public void setHappiness(int happiness) {
		this.happiness = happiness;
	}
	
	public void setWealth(int wealth) {
		this.wealth = wealth;
	}
	
}