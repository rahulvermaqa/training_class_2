// Printing tables from 1 to 30

package assignments;

public class tables_1_30 {
	
	public void calculation()
	{
		for (int counter1 = 1; counter1 <31;counter1++)
		{
			for (int counter2 = 1; counter2 <11; counter2++)
			{
				System.out.println(counter1 +"*"+ counter2 +"=" + (counter1*counter2));
			}
			System.out.println("......................");
		}
	}

	public static void main(String[] args)
	{
		tables_1_30 A = new tables_1_30();
		A.calculation();
	}
	
}
