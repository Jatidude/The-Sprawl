import java.util.ArrayList;

public class Colony {
	
	private String name;
	public ArrayList<Colonist> colonists = new ArrayList<Colonist>();
	public ArrayList<Items.Item> stock = new ArrayList<Items.Item>();
	private int population;
	private int wealth;
	private int happiness;
	
	public Colony() {
		this.name = "The Colony";
		this.population = 1;
		for(int i=0; i < 10; i++) {
			colonists.add(new Colonist());
		}
		this.wealth = calculateWealth();
		this.happiness = calculateHappiness();
	}
	
	public Colony(String n, int p) {
		setName(n);
		setPopulation(p);
		for(int i=0; i<p; i++) {
			colonists.add(new Colonist());
		}
		this.wealth = calculateWealth();
		this.happiness = calculateHappiness();	
	}
	
	public int calculateHappiness() {
		happiness = 0;
		return happiness;
	}
	
	public int calculateWealth() {
		wealth = 0;
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
		this.happiness = calculateHappiness();
	}
	
	public void setWealth(int wealth) {
		this.wealth = calculateWealth();
	}
	
}