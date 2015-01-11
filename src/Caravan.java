import java.util.ArrayList;

public class Caravan {
	
	private Colony destination;
	private String status;
	ArrayList<Colonist> caravansary = new ArrayList<Colonist>();
	ArrayList<Item> stock = new ArrayList<Item>();
	
	public Caravan(Colonist c) {
		this.addColonist(c); // A caravan needs at least one caravaneer to exist.
	}
	
	public void addColonist(Colonist c){
		caravansary.add(c);
		this.caravansary.get(this.caravansary.size()-1).setJob(Job.CARAVANEER);
		this.caravansary.get(this.caravansary.size()-1).setStatus("In Caravan");
	}
	
	public void removePerson(int a){
		caravansary.remove(a);
	}

	public String toString(){
		String ans = "";
		for(Colonist a : caravansary){
			ans+= a.getName() + "\n";
			ans+= a.getJob() + "\n";
		}
		return ans;
	}
	
	public void embark(Colony destination) {
		this.destination = destination;
		this.status = "En route to " + this.destination.getName();
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
}