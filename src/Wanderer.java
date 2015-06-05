import java.util.ArrayList;
import java.util.Scanner;

public class Wanderer extends Colonist implements Unit {
	
	public Wanderer() {
		setStatus("Wandering the expanse...");
	}
	
	public void askToJoinCaravan(Caravan c) {
		System.out.println("Your caravan " + c.getName() + " comes across a wanderer along their way.");
		if(this.getMood().compareTo(Mood.DISHEARTENED) >= 0){
			Scanner s = new Scanner(System.in);
			System.out.println("Accept " + getSex().getPronoun().toLowerCase() + " into your caravan? [Y / N]");
			if(s.nextLine().equals("Y")) {
				acceptWanderer(c);
			} else {
				revokeWanderer(c);
			}
		}
		else {
			attackCaravan(c);
		}
	}
	
	public void acceptWanderer(Caravan c) {
		c.addColonistToCaravan(this);
		setStatus("In caravan: " + c.getName());
	}
	
	public void revokeWanderer(Caravan c) {
		setStatus("Still wandering the expanse...");
		switch((int)(Math.random())*4) { // Make this more comprehensive.
			case 1:
				setMood(Mood.DISHEARTENED);
				break;
			case 2:
				setMood(Mood.HOSTILE);
				attackCaravan(c);
				break;
			case 3:
				setMood(Mood.SUICIDAL);
				break;
			case 4:
				setMood(Mood.NEUTRAL);
				break;
			default:
				break;

		}
	}
	
	public void attackCaravan(Caravan c) {
		
	}
	
}