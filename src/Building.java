import java.util.ArrayList;

public class Building {

	private ArrayList<Room> rooms = new ArrayList<Room>();
	private Room currentRoom = null;

	public Building() {

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