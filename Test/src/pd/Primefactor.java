package pd;

import java.util.Scanner;

public class Primefactor 
{
	//int[] arr = new int[4];
public void identifyfactors()
{
	System.out.println("Enter a number");
	Scanner read = new Scanner(System.in); //how to resolve this warning
	int i= read.nextInt();
	
	//int x=0;
		for (int counter =2; counter<i; counter++)
	{
		if(i%counter == 0)
		{
			int flag = primenumber(counter);
			if (flag==1)
			{
				System.out.println(counter); //how to have this value in array(when I don't know the exact size of the array)
			}
		//	this.arr[x] = counter;
		//	x++;
		}
	}
//		for (int counter=0;counter<arr.length;counter++)
//		{
//			System.out.println(arr[counter]);
//		}
}
public int primenumber(int i)
{
	int flag = 0;
	for (int counter=2;counter<=i;counter++)
	{
		if(counter == i)
		{
			
			//System.out.println("Prime number");
			flag = 1;
			break;
		}
		if(i%counter == 0)
		{
			//System.out.println(" Not Prime number");
			break;
		}
				
	}
	return flag;
				
}
	
public static void main(String[] args)
{
	Primefactor pf = new Primefactor();
	pf.identifyfactors();
	
}
	
}