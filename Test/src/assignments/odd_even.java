//Weird or Not Weird on the bases of odd/even

package assignments;
import java.util.Scanner;

public class odd_even {

	int n;
	void takeinput()
	{
		System.out.println("Enter a number");
		Scanner read = new Scanner(System.in);
		n = read.nextInt();
		read.close();
	}
	void calculation()
	{
		if (n%2 == 0)
		{
			if (n>=2 && n<=5)
			{
				System.out.println("range of 2 and 5: Not Weird");
			}
			else if (n>=6 && n<=20)
			{
				System.out.println("range of 6 and 20: Weird");
			}
			else if (n>20)
			{
				System.out.println("Greater than 20: Not Weird");
			}
			else
			{
				System.out.println("Invalid number");
			}
		}
		else if (n%2 != 0)
		{
			System.out.println("Wierd");
		}
		else
		{
			System.out.println("Inavlid number");
		}
	}
	
public static void main(String[] args)
{
	odd_even A = new odd_even();
	A.takeinput();
	A.calculation();
}
	
}
