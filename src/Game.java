// Nick Hemann, Evan Prince, Jacob Timme, Connor Slamowitz, & Josh Westhoven

/* To Be Completed:
 * 
 */

public class Game {
	
	public static void main(String[] args) {
		Colony a = new Colony("The Outskirts", 12);
		Colony b = new Colony("The Underground", 12);
		Caravan c = new Caravan(a.colonists.get(0));
		System.out.println(c.caravansary.get(0).getName());
		System.out.println(c.caravansary.get(0).getAge());
		System.out.println(c.caravansary.get(0).getJob());
		c.embark(b);
		System.out.println(c.getStatus());
	}
	
}