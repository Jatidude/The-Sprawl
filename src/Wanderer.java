import java.util.ArrayList;
import java.util.Scanner;

public class Wanderer extends Colonist implements Unit {
	
	public Wanderer() {
		setStatus("Wandering the expanse...");
	}
	
	public void askToJoinCaravan(Caravan c) {
		System.out.println("Your caravan " + c.getName() + " comes across a wanderer along their way.");
		Scanner s = new Scanner(System.in);
		System.out.println("Accept " + getSex().getPronoun().toLowerCase() + " into your caravan? [Y / N]");
		if(s.nextLine().equals("Y")) {
			acceptWanderer(c);
		} else {
			revokeWanderer();
		}
	}
	
	public void acceptWanderer(Caravan c) {
		c.addColonistToCaravan(this);
		setStatus("In caravan: " + c.getName());
	}
	
	public void revokeWanderer() {
		setStatus("Still wandering the expanse...");
		switch((int)(Math.random())*5) { // Make this more comprehensive.
			case 1:
				setMood(Mood.DISHEARTENED);
				break;
			case 2:
				setMood(Mood.HOSTILE);
				attackCaravan();
				break;
			case 3:
				setMood(Mood.SUICIDAL);
				break;
		}
	}
	
	public void attackCaravan() {
		
	}
	
}