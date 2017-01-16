//reverse a string without affecting the position of special characters

package assignments;

import java.util.Scanner;

public class reverse_string 
{
	String original_String;
	String[] string_Array;
	String[] reverse_String;
	String special_CharList = "!@#$%^&*()_+-=";
	
	public void getstring() 
	{
		System.out.println("Enter your string");
		Scanner read = new Scanner(System.in);
		original_String = read.next();
		string_Array = original_String.split("");
		this.printarray(string_Array);
		read.close();
	}

	public void reverseString() {
		reverse_String = new String[string_Array.length];
		int counter = 0;
		int counter2 = string_Array.length - 1;
		while (counter < string_Array.length) {
			if (special_CharList.contains(string_Array[counter]))
			{
				reverse_String[counter] = string_Array[counter];
				counter++;
			} else if (special_CharList.contains(string_Array[counter2])) {
				reverse_String[counter2] = string_Array[counter2];
				counter2--;
			} else {
				reverse_String[counter] = string_Array[counter2];
				counter++;
				counter2--;
			}
		}
		this.printarray(reverse_String);
	}
	
	public void printarray(String array[])
	{
		for(int counter=0; counter<array.length;counter++)
		{
			System.out.print(array[counter] + " ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		reverse_string A = new reverse_string();
		A.getstring();
		A.reverseString();
	}
}
