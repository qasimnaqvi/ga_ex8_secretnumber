package org.gradle;

import java.util.Scanner;

/**
 * Created by kgalligan on 12/2/15.
 */
public class App
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to SECRET NUMBAH! This game has been created by _____________  © 2015. Please enter your first name.");
		//take the player's name and save it to a variable called player_name


		System.out.println("Hello there, #{player_name}.  Here are the rules:");
		System.out.println("1. You will try to guess a number between 1 and 10");
		System.out.println("2. You have three tries");

		//run the function to check the user's number

	}

	static void checkUsersNumber(Scanner inp)
	{
	// define the number of tries the user has and save it to a variable
	// google how to randomly generate a number between 1-10, save that number to a variable called @random_number
		System.out.println("Your SECRET NUMBAH has been chosen - guess a numbah between 1 and 10!");

		// add a line that loops through this until the player has no tries left
		int playerGuess = Integer.parseInt(inp.nextLine());

		//check to see if the playerGuess is equal to the randomNumber
		System.out.println("OH MY GAWD YOU GUESSED THE SECRET NUMBAH, #{@random_number}!  YOU WIN!");
		//return

		//check to see if the player_guess is more than the @random_number
		System.out.println("You guessed too high, silly! You have #{tries_left} guesses before the game is over enter a another number");
		//else
		System.out.println("You guessed too low, silly! You have #{tries_left} guesses before the game is over enter a another number"

		//After loop...
		//bonus: add one more line that says "you didn't guess it was INSERT_THE_NUMBER.  better luck next time" if the @did_they_win variable isn't true
	}
}


