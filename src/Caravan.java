import java.util.ArrayList;

public class Caravan implements Unit {
	
	private String name;
	private Colony destination;
	private String status;
	ArrayList<Colonist> caravansary = new ArrayList<Colonist>();
	ArrayList<Items.Item> inventory = new ArrayList<Items.Item>();
	
	public Caravan(String s, Colonist c) {
		setName(s);
		setStatus("Idle");
		addColonistToCaravan(c); // A caravan needs at least one caravaneer to exist.
	}
	
	public void embark(Colony destination) {
		setDestination(destination);
		setStatus("En route to " + destination.getName());
	}
	
	// NAME
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	// DESTINATION
	
	public Colony getDestination() {
		return destination;
	}
	
	public void setDestination(Colony destination) {
		this.destination = destination;
	}
	
	// STATUS
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	// CARAVANSARY
	
	public ArrayList<Colonist> getCaravansary() {
		return caravansary;
	}
	
		// Returns the names of all caravaneers as a string seperated by commas.
		public String getCaravansaryString() {
			String ans = "";
			if(getCaravansary().size()==1) {
				for(Colonist c : getCaravansary()) {
					ans += c.getName();
				}
			} else {
				for(Colonist c : getCaravansary()) {
					ans += c.getName() + ", ";
				}
			}
			return ans;
		}
	
	public void addColonistToCaravan(Colonist c) {
		getCaravansary().add(c);
		getCaravansary().get(getCaravansary().size()-1).setJob(Job.CARAVANEER);
		getCaravansary().get(getCaravansary().size()-1).setStatus("In Caravan: " + getName());
	}
	
	public void removeColonistFromCaravan(Colonist c) {
		for(Colonist z : getCaravansary()) {
			if(z.equals(c)) {
				getCaravansary().remove(z);
				z.setJob(null);
				z.setStatus("Idle");
			}
		}
	}
	
}
