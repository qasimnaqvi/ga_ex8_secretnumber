import java.util.Random;
import java.util.Scanner;

public class App
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner( System.in );

		System.out.println("Welcome to SECRET NUMBER! Please enter your first name.");
		String player_name = input.next();

		//take the player's name and save it to a variable called player_name


		//Insert the player's name below
		System.out.println("Hello there," + player_name + ".  Here are the rules:");
		System.out.println("1. You will try to guess a number between 0 and 10");
		System.out.println("2. You have three tries");

		//run the function to check the user's number

		checkUsersNumber();


		//If the user guessed correctly, print a congratulations message, otherwise print a failure message

	}

	static boolean checkUsersNumber()
	{
		//Code for getting a random number
		Random r = new Random();
		int secretNumber = r.nextInt(11);

		//Create a loop to get the player's guess and check it
		//Get the user's guess

		System.out.println("Your SECRET NUMBER has been chosen - guess a number between 0 and 10!");
		System.out.println(secretNumber);
		Scanner input = new Scanner( System.in );

		int inputNumber = input.nextInt();
		boolean isCorrect = false;
		int counter = 1;

		if(inputNumber == secretNumber){
			System.out.println("Nice. You got speciall skills!");

		while(inputNumber != secretNumber && counter<3) {
			//Check the guess

			if(inputNumber>secretNumber) {
				System.out.println("You guessed too high, silly! You have " + (3-counter) + " guesses before the game is over");
			}
			if(inputNumber<secretNumber){
				System.out.println("You guessed too low, silly! You have" + (3-counter) + " guesses before the game is over");
			}
			System.out.println("Guess again!");
			counter++;

			}

			inputNumber = input.nextInt();
		}


		//Check the guess

		return inputNumber == secretNumber;

	}
}


