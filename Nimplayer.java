import java.util.Scanner;

public class Nimplayer {
	private Scanner keyboard;
	private String name;

	//constructor which passes Scanner object from main
	public Nimplayer(Scanner input) {
		this.keyboard = input;
	}

	public void getName() {
		name = keyboard.nextLine();
	}

/*
	public int removeStone() {
		keyboard.nextInt();
		return 0;
		//action takes place
	}
*/

}