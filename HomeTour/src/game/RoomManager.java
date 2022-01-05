package game;

import fixtures.Room;

public class RoomManager {
	public Room startingRoom;
	String exit;
	private Room[] rooms = new Room[5];

	
	public RoomManager() {
	}

	public void init() {
		Room livingRoom = new Room("Living Room", "1",
				"You have open the front door. You are standing in the living room.  \n"
						+ "You see two doors on either side of you and an open entry way straight ahead.");
		
		this.rooms[0] = livingRoom;
		this.startingRoom = livingRoom;

		Room kitchen = new Room("Kitchen", "The Kitchen",
				"You are in the kitchen. You see a dinning table along with the stove, fridge and microeave. \n "
				+ "You see two doors on either side and an open entry way straight ahead of you.");
		this.rooms[1] = kitchen;
		
		
		Room bathroom = new Room("bathroom", "The Bathroom",
				"You entered the bathroom. When you open the door you will have open entry on either side and a door straight ahead of you.");
		this.rooms[2] = bathroom;
		
		Room masterBedroom = new Room("Master Bedroom", "The Master Bedroom",
				"You are in the bed room. In front of you there will be a door and two open entryways on either side.");
		this.rooms[3] = masterBedroom;
		
		
		livingRoom.setExits(kitchen, null, masterBedroom, bathroom);
		
		kitchen.setExits(null, livingRoom , masterBedroom, bathroom);
		
		bathroom.setExits(kitchen, null, masterBedroom, bathroom);
		
		masterBedroom.setExits(kitchen, livingRoom,null, bathroom);
	}


}