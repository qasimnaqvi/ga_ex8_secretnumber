package org.gradle;

/**
 * Created by kgalligan on 12/2/15.
 */
public class App
{
	public static void main(String[] args)
	{
		concatStrings();
	}

	private static void concatStrings()
	{
		String lastBit = "a string";
		String wholeString = "This is "+ lastBit;

		System.out.println(wholeString);
	}
}


