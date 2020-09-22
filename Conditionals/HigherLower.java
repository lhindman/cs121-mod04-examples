import java.util.Random;
import java.util.Scanner;

/**
 * Demonstrates how conditionals can be used to play a simple
 * guessing game.
 * 
 * @author CS121 instructors
 */
public class HigherLower
{
	public static void main(String[] args)
	{
		final int MAX_VALUE = 10;
		
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		
		int value = random.nextInt(MAX_VALUE) + 1;
		
		System.out.print("Guess a number between 1 and " + MAX_VALUE + ": ");
		int input = scan.nextInt();
		
		if(input == value)
		{
			System.out.println("You guessed the random number! " + value);
			System.out.println("Good job :)");
		}
		else if (input < value)
		{
			System.out.println("Higher");
		}
		else 
		{
			System.out.println("Lower");
		}
		
		System.out.println("Game over. Goodbye!");
		
		scan.close();
	}
}
