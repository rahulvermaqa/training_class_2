package pd;

import java.util.Scanner;

public class ArrayExample {

	int[] arr = new int[4];
	public void getarray()
	{
		System.out.println("Enter values");
		for(int i=0; i<arr.length; i++)
		{
		//System.out.println("Checkpoint 1");
		Scanner read = new Scanner(System.in);
		arr[i] = read.nextInt();
		//System.out.println("Checkpoint 2");
		}
		
	}
	public void printarray()
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Your array is" + arr[i]);
		}
		
		
	}
		
	
	public static void main(String[] args)
	{
		ArrayExample A = new ArrayExample();
		A.getarray();
		A.printarray();
	}
}
