package assignments;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Checked_unchecked_exceptions {

	public void checked_exception()
	{
		try
		{
		FileReader F = new FileReader("C:\\Users\\rahulverma\\Desktop\\example.txt");
		BufferedReader fileInput = new BufferedReader(F);
		for(int i=0;i<3;i++)			//Need to replace hard coded 3 with a function
		{
		System.out.println(fileInput.readLine());
		}
		F.close();
		}
		catch(IOException e)
		{
			System.out.println("File not found");
		}
	}
	public void unchecked_exception()
	{
		try
		{
		System.out.println("Please enter your rating from 1 to 5");
		int rating;
		Scanner S = new Scanner(System.in);
		rating = S.nextInt();
		System.out.println("You have entered a rating of " + rating);
		S.close();
		}
		catch(InputMismatchException e)
		{
			System.out.println("You have not entered an integer value");
		}
	}
	
}
