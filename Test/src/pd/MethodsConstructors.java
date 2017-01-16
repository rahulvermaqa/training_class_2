package pd;

public class MethodsConstructors 
{
	public MethodsConstructors()
	{
		System.out.println("Default Constructor called");
	}
	public MethodsConstructors(int x)
	{
		System.out.println("Parametrized Constructor called " + x );
	}
	public void method()
	{
		System.out.println("method called");
	}
	public void method(String S)
	{
		System.out.println("Parameterized method called " + S);
	}

public static void main(String[] args)
{
	MethodsConstructors M = new MethodsConstructors();
	new MethodsConstructors(7);
	M.method();
	M.method("Text");
	
}

}
