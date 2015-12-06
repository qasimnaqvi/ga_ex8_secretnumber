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
		System.out.println("did you pay your bills? (yes/no)");
		String paid = inp.nextLine();

		System.out.println("did you cancel");
		String canceled = inp.nextLine();

		System.out.println("are you an admin");
		String admin = inp.nextLine();

		System.out.println("are you signed in");
		String signedIn = inp.nextLine();


		if (paid.equals("no") || canceled.equals("yes"))
		{
			System.out.println("go away");
		}
		else if (signedIn.equals("yes") && admin.equals("yes"))
		{
			System.out.println("you can see and change all the pages");
		}
		else if (signedIn.equals("yes") && admin.equals("no"))
		{
			System.out.println("you can see all the pages");
		}
		else if (signedIn.equals("no"))
		{
			System.out.println("you can't see any of the pages, please sign in");
		}
		else
		{
			System.out.println("sorry charlie");
		}
	}
}


