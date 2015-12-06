package org.gradle;

import java.util.Scanner;

/**
 * Created by kgalligan on 12/2/15.
 */
public class App
{
	public static void main(String[] args)
	{
		Scanner inp = new Scanner(System.in);

		System.out.print("Enter your first name: ");
		String firstName = inp.nextLine();

		System.out.print("Enter your last name: ");
		String lastName = inp.nextLine();

		String fullName = cleanFullName(firstName, lastName);
		System.out.println("Full name: "+ fullName);
	}

	static String cleanFullName(String firstName, String lastName)
	{
		firstName = capitalize(firstName);
		lastName = capitalize(lastName);

		return firstName + " " + lastName;
	}

	private static String capitalize(String firstName)
	{
		firstName = firstName.toLowerCase();
		firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
		return firstName;
	}
}


