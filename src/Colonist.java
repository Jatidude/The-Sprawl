import java.util.ArrayList;
import java.util.Collections;

public class Colonist {

	private double health;
	private int age;
	private int morale;
	private String status;
	private Name name;
	private Mood mood;
	private Sex sex;
	private Occupation occupation; // A colonist's occupation was the job they held before the outbreak.
	private Job job; // A colonist's job is the current role the colonist holds in the colony.
	private ArrayList<Ailment> ailments = new ArrayList<Ailment>();
	private ArrayList<Items.Item> inventory = new ArrayList<Items.Item>();
	private boolean infected;
	// private Nature nature;
	
	public Colonist() {
		setHealth(100.0);
		setAge(((int)(Math.random()*41))+18);
		setStatus("Idle");
		setName(Name.values()[((int)(Math.random()*101))]);
		setMood(Mood.NEUTRAL); // Maybe change this later.
		if(getName().ordinal() <= 50) {
			setSex(Sex.MALE);
		} else {
			setSex(Sex.FEMALE);
		}
		if(this.getAge() <= 18) {
			setOccupation(Occupation.STUDENT);
		} else {
			int temp = Occupation.values().length;
			setOccupation(Occupation.values()[((int)(Math.random()*temp))]);
		}
		setInfected(false);
	}
	
	// HEALTH

	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}
	
	// AGE
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	// MORALE
	
	public int getMorale() {
		return morale;
	}
	
	public void updateMorale() {
		morale += 1; // Change this.
	}
	
	// STATUS
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	// NAME
	
	public Name getName() {
		return name;
	}
	
	public void setName(Name name) {
		this.name = name;
	}
	
	// MOOD
	
		public Mood getMood() {
			return mood;
		}
		
		public void setMood(Mood mood) {
			this.mood = mood;
		}
	
	// SEX
	
	public Sex getSex() {
		return sex;
	}
	
	public void setSex(Sex sex) {
		this.sex = sex;
	}
	
	// OCCUPATION
	
	public Occupation getOccupation() {
		return occupation;
	}
	
	public void setOccupation(Occupation occupation) {
		this.occupation = occupation;
	}
	
	// JOB
	
	public Job getJob() {
		return job;
	}
	
	public void setJob(Job job) {
		this.job = job;
	}
	
	// AILMENTS
	
	public ArrayList<Ailment> getAilments() {
		return ailments;
	}

	public void addAilment(Ailment a) {
		getAilments().add(a);
	}
	
	public void removeAilment(Ailment a) {
		for(Ailment z : this.getAilments()) {
			if(z.equals(a)) {
				this.getAilments().removeAll(Collections.singleton(a));
			}
		}
	}
	
	public void exposeToAilment(Ailment a) {
		int ailmentDeterminant = ((int)(Math.random()*41));
		if(this.getHealth() < a.getInfectivity() && ailmentDeterminant >= 50) {
			this.addAilment(a);
		}
	}
	
	// INVENTORY
	
	public ArrayList<Items.Item> getInventory() {
		return inventory;
	}
	
	public void addItemToInventory(Items.Item i) {
		getInventory().add(i);
	}
	
	// INFECTED

	public boolean isInfected() {
		return infected;
	}

	public void setInfected(boolean infected) {
		this.infected = infected;
	}
	
}