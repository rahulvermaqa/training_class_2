package pd;

public class Print {
	
	public Print()
	{
		System.out.println("Print function called");
	}
	public Print(int x)
	{
		System.out.println("Print function called" + x);
	}
	public Print(int age, String name, int Salary)
	{
		System.out.println("Print function called" + "age:" + age + "name:" + name + "Salary:" + Salary);
	}
	public int scan()
	{
		int x=10;
		System.out.println("Scan function called");
		
		return x;
	}

public static void main(String[] args)
{
	Print P1 = new Print();
	new Print(27,"Rahul",10000);
	int y = P1.scan();
	System.out.println(y);
}
}
