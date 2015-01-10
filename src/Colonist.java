import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Colonist {
	
	private double health;
	private int age;
	private Name name;
	private Occupation occupation; // A colonist's occupation was the job they held before the outbreak.
	private int occupationTier;
	private Job job; // A colonist's job is the current role the colonist holds in the colony.
	private ArrayList<Object> posessions = new ArrayList<Object>();
	private String status;
	private String gender;
	private Ailments ailments;
	private boolean infected;

	public Colonist() {
		health = 100.0;
		age = ThreadLocalRandom.current().nextInt(10,60)
		name = Name.values()[ThreadLocalRandom.current().nextInt(1,Name.values().length-1)];
		status = "Idle"
		if(name.LocationInNAMEenum <= 50) {
			gender = "Male";
		} else {
			gender = "Female";
		}
		ailments = Ailments.HEALTHY;
		infected = false;
		if(age >= 18) {
			occupation = Occupation.values()[ThreadLocalRandom.current().nextInt(1,Occupation.values().length-1)];
		}
		else {
			occupation = Occupation.STUDENT;
		}
	}
	
	public double getHealth() {
		return this.health;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public Name getName() {
		return this.name;
	}
	
	// A colonist has an occupation until they get a job. 
	public String getJob() {
		String output = "";
		if(this.job != null) {
			output += this.job;
			return output;
		}
		else {
			output += this.occupation;
			return output;
		}
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setHealth(double health) {
		this.health = health;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName(Name name) {
		this.name = name;
	}
	
	public void setJob(Job job) {
		if(this.occupation != null){
			this.occupation = null;
		}
		this.job = job;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public void setInfected(boolean infected) {
		this.infected = infected;
	}
	
}
