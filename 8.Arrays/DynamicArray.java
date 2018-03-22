/*
Program to read values into array dynamically
*/

import java.util.Scanner;
class DynamicArray
{
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the array size..");
		int a=input.nextInt();
		
		int array[]=new int[a];
		System.out.println("Enter the elements of array..");
		for(int i=0;i<a;i++) //Reading elements from array
		{
			array[i]=input.nextInt();
		}
		System.out.println("\nElements of array are:");
		for(int i=0;i<a;i++)
		{
			System.out.println(array[i]+ "\t");
		}
	}
}

/*Output:


F:\NIIT\JAVA\8.Arrays>javac DynamicArray.java

F:\NIIT\JAVA\8.Arrays>java DynamicArray
Enter the array size..
5
Enter the elements of array..
43
32
21
21
34

Elements of array are:
43
32
21
21
34

*/