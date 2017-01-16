//age calculation of a person

package assignments;
import java.util.Scanner;

public class age_calculation {

	public static void main(String[] args)
	{
		System.out.println("Enter your age");
		Scanner read = new Scanner(System.in);
		int i = read.nextInt();
		read.close();
		
		Person p = new Person(i);
		p.amIOld();
		for (int counter = 0; counter<13; counter++)
		{
		p.yearPasses();
		}
		p.amIOld();
		
	}
}
class Person
{
	int age;
	public Person(int initialAge)
	{
		if (initialAge > 0)
		{
			age = initialAge;
			System.out.println("You have entered age in positive.. setting your age to " + age);
		}
		else
		{
			age = 0;
			System.out.println("Age is not valid, setting age to 0.");
		}
		
	}
	void yearPasses()
	{
		age = age+1;
		System.out.println("Your age after one year would be " + age);
	}
	void amIOld()
	{
		if (age <13)
		{
			System.out.println("You are Young");
		}
		else if (age>=13 && age <18)
		{
			System.out.println("You are a teenager");
		}
		else
		{
			System.out.println("You are old");
		}
	}
}
