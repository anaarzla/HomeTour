package fixtures;

public class Room extends Fixture{
	private Room[] exits;

	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[4]; 
	}

	public Room[] getExits() {
		return exits;
	}

	public void setExits(Room N, Room S, Room E, Room W) {
		exits[0] = N;
		exits[1] = S;
		exits[2] = E;
		exits[3] = W;
	}

	public Room getExit(String commands) {
		if (commands.equals("North") || commands.equals("north")) {
			return exits[0];
		}
		if (commands.equals("South") || commands.equals("south")) {
			return exits[1];
		}
		if (commands.equals("East") || commands.equals("east")) {
			return exits[2];
		}
		if (commands.equals("West") || commands.equals("west")) {
			return exits[3];
		}
		return null;

	}

}