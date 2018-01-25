import java.util.Random;
import java.util.Scanner;

public class DiceRolling {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int diceSides;
		String cont;
		int rollCount = 1;

		// Start program by obtaining user input for diceSides
		System.out.println("Welcome to the Grand Circus Casion!\n");
		System.out.println("How many sides should each die have? ");
		diceSides = scan.nextInt();

		// do while loop "rolls" dice and prints the number of rolls and roll result
		do {
			System.out.println("Roll " + rollCount + ":");
			System.out.println(diceRoll1(diceSides));
			System.out.println(diceRoll2(diceSides) + "\n");
			System.out.println("Would you like to roll again? y/n");
			cont = scan.next();
			++rollCount;
		} while (cont.equalsIgnoreCase("y"));

		System.out.println("Thanks for playing!");
		scan.close();
	}
	// new method for roll 1
	public static int diceRoll1(int diceSides) {
		Random rand = new Random();
		int roll1 = rand.nextInt(diceSides) + 1;
		// int roll1 = (int) (Math.random() * diceSides + 1);
		return roll1;

	}
	// new method for roll 2
	public static int diceRoll2(int diceSides) {
		Random rand = new Random();
		int roll2 = rand.nextInt(diceSides) + 1;
		// int roll2 = (int) (Math.random() * diceSides + 1);
		return roll2;
	}

}
