package pd;
import java.util.Scanner;

class Switch {

 void method()
{
	System.out.println("Enter a number from one to Seven");
	Scanner read = new Scanner(System.in);
	int value = read.nextInt();
	switch(value)
	{
	case 1:
		System.out.println("One");
		break;
	case 2:
		System.out.println("Two");
		break;
	case 3:
		System.out.println("Three");
		break;
	case 4:
		System.out.println("Four");
		break;
	case 5:
		System.out.println("Five");
		break;
	case 6:
		System.out.println("Six");
		break;
	case 7:
		System.out.println("Seven");
		break;
	default:
		System.out.println("Incorrect number");
		break;

	}
	
}
public static void main(String[] args)
{
	Switch s = new Switch();
	s.method();
}
}