//Convert to binary and then find the maximum consecutive occurrence of 1

package assignments;
import java.util.Scanner;

public class binary_occurance_1 {
	String[] bArray;
	static int counter = 0;
	int array[] = new int[100];
	
	public void binary_Conversion2()	//this is using predefined function in order to validate the output of self created method #binary_Conversion
	{
		System.out.println("Enter a number");
		Scanner read = new Scanner(System.in);
		int number = read.nextInt();
		String bNumber = Integer.toBinaryString(number);
		bArray = bNumber.split("");		
		System.out.println("Using predefined function: " + bNumber + "\n");
		//read.close();
	}
	
	public void binary_Conversion() //this is method without using the predefined function 
	{
		System.out.println("\nEnter a number");
		Scanner read = new Scanner(System.in);
		int number = read.nextInt();
		while(number>1)
		{
				
			array[counter] = number%2;
			number = number/2;
			counter++;
		}
		array[counter] = 1;
		System.out.print("Without using predefined function ");
		for(int count = counter; count>=0;count--)
		{
			System.out.print(array[count]);
		}
		System.out.println("\n");
	}
	public void finding_Ones()
	{
		int max = 0;
		int finalmax = 0;
		for(int counter = 0;counter <= this.counter+1; counter++)
		{
			if (array[counter] == 1)
					{
				//System.out.println("checkpoint");		
				max++;
				if (counter == this.counter-1 && max>finalmax)
				{
					finalmax = max;
				}
					}
			else if(max>finalmax)
			{
				finalmax = max;
				max = 0;
				
			}
			else
			{
				max = 0;
			}
								
		}
		System.out.println("The maximum number of occurance of 1 is " + finalmax);
	}

public static void main(String[] args)
{
	
	binary_occurance_1 A = new binary_occurance_1();
	
	A.binary_Conversion2();
	A.binary_Conversion();
	A.finding_Ones();
	
}
	
}
