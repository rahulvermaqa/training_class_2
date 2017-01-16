//Printing 2d array in spiral form; this programs can take values and print them as 2d array but not in spiral form

package assignments;
import java.util.Scanner;

public class two_d_array {
	int rows;
	int columns;
	int[][] arr;
		
	public void takeinput()
	{
		System.out.println("Enter number of rows for the array");
		Scanner read = new Scanner(System.in);
		rows = read.nextInt();
		System.out.println("Enter number of columns for the array");
		columns = read.nextInt();
		arr = new int[rows][columns];
		//read.close();
	}
	 public void insertingvalues()
		{
		 	System.out.println("Enter values of array");
		 	//Scanner read = null;
			for (int counter = 0; counter < rows; counter++)
			{
				for(int counter2 = 0; counter2< columns; counter2++)
				{
					Scanner read = new Scanner(System.in);
					arr[counter][counter2] = read.nextInt();
				}
				System.out.println("");
			}
			//read.close();
		}
	 public void printarray()
		{
			for (int counter = 0; counter < rows; counter++)
			{
				for(int counter2 = 0; counter2< columns;counter2++)
				{
					System.out.print(arr[counter][counter2] + " ");
						
				}
					System.out.println("");
			}
		}

public static void main(String[] args)
{
	two_d_array A = new two_d_array();
	A.takeinput();
	A.insertingvalues();
	A.printarray();
}
}
