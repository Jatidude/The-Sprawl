import java.util.ArrayList;
import java.awt.Point;

public class Colony {
	
	private String name;
	private int population;
	private int wealth;
	private int morale;
	private int aModifier;
	private ArrayList<Point> territory = new ArrayList<Point>();
	private ArrayList<Colonist> colonists = new ArrayList<Colonist>();
	private ArrayList<Items.Item> stockpile = new ArrayList<Items.Item>();

	public Colony() {
		setName("The Colony");
		setPopulation(1);
		for(int i=0; i<getPopulation(); i++) {
			colonists.add(new Colonist());
		}
		wealth = getPopulation();
		morale = getPopulation();
	}
	
		public Colony(String name, int population) {
			setName(name);
			setPopulation(population);
			for(int i=0; i<getPopulation(); i++) {
				colonists.add(new Colonist());
			}
			wealth = getPopulation();
			morale = getPopulation();
		}
	
	// NAME
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// POPULATION
	
	public int getPopulation() {
		return population;
	}
	
	public void setPopulation(int population) {
		this.population = population;
	}

	// TERRITORY

	public ArrayList<Point> getTerritory() {
		return territory;
	}

	public void addTerritory(Point p){
		getTerritory().add(p);
		calcDensity();
	}

	// DISEASE

	public void calcDensity() {
		aModifier = (population/territory.size())
	}

	public int getModifier(){
		return this.aModifier;
	}
	
	// WEALTH
	
	public int getWealth() {
		return wealth;
	}
	
	public void setWealth(int wealth) {
		this.wealth = wealth;
	}
	
	// MORALE
	
	public int getMorale() {
		return morale;
	}
	
	public void setMorale(int morale) {
		this.morale = morale;
	}
	
	public void updateMorale() {
		for(Colonist c : getColonists()) {
			c.updateMorale();
			morale += c.getMorale();
		}
	}
	
	// COLONISTS

	public ArrayList<Colonist> getColonists() {
		return colonists;
	}

	public void addColonist(Colonist c) {
		getColonists().add(c);
		population++
		calcDensity();
	}
	
	// STOCKPILE
	
	public ArrayList<Items.Item> getStockpile() {
		return stockpile;
	}
	
	public void addItemToStockpile(Items.Item i) {
		getStockpile().add(i);
	}
	
}