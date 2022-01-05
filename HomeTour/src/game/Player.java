package game;

import fixtures.Room;

//This class represents the player moving through these rooms. 

public class Player {
//room current room : room player is in

	public Room currentRoom;
	public String directionalMap;
	public String[] command;
	
	
	public String getCurrentRoom() {
		return "Current room: " + this.currentRoom.name;
	}

	public void setCurrentRoom(Room roomManagerSetRoom) {
		this.currentRoom = roomManagerSetRoom;
	}

	public String directionalMap() {
		// TODO Auto-generated method stub
		return null;
	}
}