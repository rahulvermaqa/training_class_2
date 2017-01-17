package assignments;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Try_catch_example {

	public void take_input()
	{
		int divident,divisor,quotient,remainder;
		try
		{
		Scanner read;
		read = new Scanner(System.in);
		System.out.println("Enter a number that would be divident");
		divident = read.nextInt();
		System.out.println("Enter a number that would be divisor");
		divisor = read.nextInt();
		quotient = divident/divisor;
		remainder = divident%divisor;
		System.out.println("Your quotient is " + quotient);
		System.out.println("Your remainder is " + remainder);
		read.close();
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("You are trying to divide by zero, please try again");
			
		}
		catch(InputMismatchException e)
		{
			System.out.println("You have not entered valid integer, please try again");
			
		}
		catch(Exception e)
		{
			System.out.println("General exception");
		}
		finally
		{
			System.out.println("\nHave a nice day");
		}
		
	}
}