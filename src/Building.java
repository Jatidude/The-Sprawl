import java.util.ArrayList;

public class Building {

	private String name;
	private ArrayList<Room> rooms = new ArrayList<Room>();
	// private Room currentRoom = null;

	public Building() {
		name = "Unknown Building";
	}

	public Building(String s) {
		setName(s);
	}

	public ArrayList<Room> getRooms() {
		return rooms;
	}

	public Room getCurrentRoom() {
		return currentRoom;
	}

	public void addRoom(Room r) {
		getRooms().add(r);
	}

}