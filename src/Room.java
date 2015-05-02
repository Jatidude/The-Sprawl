import java.util.ArrayList;

public class Room {

	private String name;
	private ArrayList<Item> contents = new ArrayList<Item>();

	public Room() {
		setName("Empty Room");
	}

	public Room(String s) {
		setName(s);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}