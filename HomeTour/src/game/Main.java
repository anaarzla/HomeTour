package game;

import java.util.HashMap;
import java.util.Scanner;

class Main {
	static Scanner s = new Scanner(System.in);
	static String Pos = "";
	static String[] input = new String[2];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to Home Tour? (y - continue /n - quit). ");

		String gameStart = s.nextLine();

		if (gameStart.equals("y") || gameStart.equals("Y")) {

			Player p1 = new Player();
			RoomManager m1 = new RoomManager();

			m1.init();
			p1.setCurrentRoom(m1.startingRoom);

			do {
				printRoom(p1);
				collectInput();
				parse(input, p1);
			} while (gameStart != "q");
		}
	}

	private static void printRoom(Player p1) {
		System.out.println(p1.getCurrentRoom());
		System.out.println(p1.currentRoom.longDescription);
		System.out.println("Exits:");

		HashMap<Integer, String> directionMap = new HashMap<>();
		directionMap.put(0, "North:");
		directionMap.put(1, "South:");
		directionMap.put(2, "East:");
		directionMap.put(3, "West:");

		for (int i = 0; i < 4; i++) {
			if (p1.currentRoom.getExits()[i] != null) {
				System.out.print(directionMap.get(i) + " " + p1.currentRoom.getExits()[i].shortDescription + "\n");
				
			}
		}
		System.out.println("(press 'q' to discontinue game.)");

	}

	private static String[] collectInput() {
		String Input = "";

		Input = s.nextLine();
		int spaceKey = Input.indexOf(" ");
		if (spaceKey > 0) {

			input[0] = Input.substring(0, spaceKey); 
			spaceKey++;
			input[1] = Input.substring(spaceKey);
		} else {
			input[0] = Input;
		}

		return (input); 
	}

	private static void parse(String[] commands, Player player) {
		if (commands[0]==("q")) {
			System.out.println("The game has ended.");
			System.exit(0);
		}
		player.currentRoom = player.currentRoom.getExit(commands[1]); 
	}
}