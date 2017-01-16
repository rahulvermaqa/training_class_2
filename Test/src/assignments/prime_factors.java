// Prime factors program

package assignments;
import java.util.Scanner;


public class prime_factors {
	
	int number;
	public void getnumber()
	{
		System.out.println("Enter a number of which you want to know the prime factor");
		Scanner read = new Scanner(System.in);
		number = read.nextInt();
		read.close();
	}
	public void calculation()
	{
		int i=2;
		System.out.print("Prime factors of " + number + " are: ");
		while (i<=number)
		{
			if(number%i == 0)
			{
				System.out.print(i + " ");
				number = number/i;
			}
			else
			{
				i++;
			}
		}
	}
	
	public static void main(String[] args)
	{
		prime_factors A = new prime_factors();
		A.getnumber();
		A.calculation();
		
	}

}
