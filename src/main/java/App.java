import java.util.Random;

public class App
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to SECRET NUMBER! Please enter your first name.");
		//take the player's name and save it to a variable called player_name


		//Insert the player's name below
		System.out.println("Hello there, PLAYER_NAME.  Here are the rules:");
		System.out.println("1. You will try to guess a number between 0 and 10");
		System.out.println("2. You have three tries");

		//run the function to check the user's number
		//If the user guessed correctly, print a congratulations message, otherwise print a failure message

	}

	static boolean checkUsersNumber()
	{
		//Code for getting a random number
		Random r = new Random();
		int secretNumber = r.nextInt(11);

		//Create a loop to get the player's guess and check it

		System.out.println("Your SECRET NUMBER has been chosen - guess a number between 0 and 10!");
		//Get the user's guess

		//Check the guess

		//check to see if the player_guess is more than the @random_number
		System.out.println("You guessed too high, silly! You have REMAINING_GUESSES guesses before the game is over");
		//else
		System.out.println("You guessed too low, silly! You have REMAINING_GUESSES guesses before the game is over");

	}
}


