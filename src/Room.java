public class Room {

	private String name;

	public Room() {
		setName("Unknown Room");
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