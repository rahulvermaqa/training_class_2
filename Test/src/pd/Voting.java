package pd;

import java.util.Scanner;

public class Voting
{
	public int YOB;
	public String sex;
	public int age;
	//static String Company_Name = "QA InfoTech"; 
	 
	 public void information()
	{
		System.out.println("\nEnter your year of birth");
		Scanner read = new Scanner(System.in);
		YOB = read.nextInt();
		age = 2017 - YOB;
		
		if (age > 18)
		{
		System.out.println("\nEnter your sex");
		sex = read.next();
		sex = sex.toLowerCase();
		}
		
		read.close();
		
	}
	
public static void main(String[] args)
{

	Voting voter = new Voting();
	
	voter.information();
	if (voter.age >= 18)
	{
		if (voter.sex == "male")
			{
			System.out.println("\nYour age is " + voter.age + ". You are eligible for Vote, Please move to Male voting booth to vote");
			}
		else if (voter.sex.equals("female"))
		{
		System.out.println("\nYour age is " + voter.age + ". You are eligible for Vote, Please move to Female voting booth to vote");
		}
	
		else
			{
			System.out.println("Incorrecr information entered");
			}
	}
	else
			{
			int wait_age = 18 - voter.age;
			System.out.println("\nYou are not eligible for Vote, please wait for " + wait_age + " more years to vote");
			}
	
	
}
}
