//Calculating mealPrice with taxes

package assignments;
import java.util.Scanner;

public class Meal_price 
{

	 double mealPrice;
	 int tipPercent;
	 int taxPercent;
	
	public void takeinput()
	{
		Scanner read = new Scanner(System.in);
		System.out.println("Enter meal price");
		mealPrice = read.nextDouble();
		System.out.println("Enter tip percent");
		tipPercent = read.nextInt();
		System.out.println("Enter tax percent");
		taxPercent = read.nextInt();
		read.close();
	}
	void mealcalculation()
	{
		mealPrice = mealPrice + (mealPrice * (tipPercent * 0.01)) + (mealPrice *(taxPercent*0.01));
		System.out.println("\nFinal meal price after tax is " + mealPrice);
	}
	public static void main(String[] args)
{
	Meal_price A = new Meal_price();
	A.takeinput();
	A.mealcalculation();
	
}
	
}
