package pd;
import java.util.Scanner;

public class Loops {
	
	public void loop()
	{
	System.out.println("Enter the name of the loop you want to see");
	Scanner read = new Scanner(System.in);
	String name = read.next();			//program fails while user enter do while with spaces
	name = name.toLowerCase();
	System.out.println("Enter the number of iterations in the loop");
	int iterations = read.nextInt();
	int counter =0;
	if (name.equals("for"))
	{
		for(counter =0;counter<iterations;counter++)
		{
		System.out.println("For loop");
		}
	}
	else if (name.equals("while"))
	{
		while(counter<iterations)
		{
		System.out.println("While loop");
		counter++;
		}
	}
	else if (name.equals("dowhile") || name.equals("do while"))
	{
		do
		{
			System.out.println("do While");
			counter++;
		}
		while(counter < iterations);
		
	}
	else
	{
		System.out.println("incorrect values entered");
	}
	
	}

public static void main(String[] args)
{
	Loops L = new Loops();
	L.loop();
}
}
