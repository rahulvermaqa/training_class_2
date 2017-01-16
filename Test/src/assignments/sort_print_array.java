//Sorting and printing an array

package assignments;

import java.util.Scanner;

public class sort_print_array {
	 int number;
	 int[] arr;

	public void takeinput() {
		System.out.println("Enter the size of the array");
		Scanner read = new Scanner(System.in);
		number = read.nextInt();
		arr = new int[number];// can not declare the array here, needs to split the declaration and initialization
		//read.close();
	}

	public void insertingvalues() {
		Scanner read = null;
		for (int counter = 0; counter < number; counter++) {
			System.out.println("Enter your values");
			read = new Scanner(System.in);
			arr[counter] = read.nextInt();
		}
		//read.close(); // Statement was causing problems in program
	}

	public void printarray() {
		for (int counter = 0; counter < number; counter++) {
			System.out.println(arr[counter]);
		}
	}

	public void sortarrray() {
		for (int counter = 0; counter < number; counter++) {
			for (int counter2 = counter + 1; counter2 < number; counter2++) {
				if (arr[counter] > arr[counter2]) // if(arr[0]>arr[1])
				{
					int temp;
					temp = arr[counter];
					arr[counter] = arr[counter2];
					arr[counter2] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		sort_print_array A = new sort_print_array();
		A.takeinput();
		A.insertingvalues();
		System.out.println("Your original array was ");
		A.printarray();
		A.sortarrray();
		System.out.println("\nYour sorted array is ");
		A.printarray();
	}
}
