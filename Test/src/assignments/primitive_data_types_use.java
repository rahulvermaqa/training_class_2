//declares and initializes all 8 primitive datatypes

package assignments;

public class primitive_data_types_use {
	byte by = 100;
	short s = 1000;
	int i = 10000;
	long l = 100000;
	float f = 100.5f;
	double d = 100.10;
	boolean bo = true;
	char c = 'R';
	
	public primitive_data_types_use()
	{
		System.out.println("Your byte value is " + by);
		System.out.println("\nYour short value is " + s);
		System.out.println("\nYour integer value is " + i);
		System.out.println("\nYour long value is " + l);
		System.out.println("\nYour float value is " + f);
		System.out.println("\nYour double value is " + d);
		System.out.println("\nYour Boolean value is " + bo);
		System.out.println("\nYour Character value is " + c);
	}

public static void main(String[] args)
{
	new primitive_data_types_use();
	
}

}
