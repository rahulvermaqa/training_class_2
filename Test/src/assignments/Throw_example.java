package assignments;

import java.util.Scanner;

public class Throw_example 
{

	public void Throw_Arithmetic()
	{
	
		Scanner read = new Scanner(System.in);
		System.out.println("Enter a divident");
		int  divident = read.nextInt();
		System.out.println("Enter a divisor");
		int divisor = read.nextInt();
		read.close();
		if(divisor == 1)
		{
		throw new ArithmeticException();
		}
		int Quotient = divident/divisor;
		System.out.println("Your Quotient is " + Quotient);
				
		//return Quotient; //unreachable code.. how to fix this?
		
	}
	
}
