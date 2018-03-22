/*
Program to find greatest of 3 numbers
*/

import java.util.Scanner;

class Greatest
{
	public static void main(String[]args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter any 3 numbers");
		
		//Reading numbers		
		int a=obj.nextInt();
		int b=obj.nextInt();
		int c=obj.nextInt();
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A is greatest");
			}
			else
			{
				System.out.println("B is greatest");
			}
		}
		
		else if(b>c)
		{
			System.out.println("B is greatest");
		}
		
		else
		{
			System.out.println("C is greatest");
		}
	}
}


/*Output:


F:\NIIT\JAVA\6.Scanner demo>javac Greatest.java

F:\NIIT\JAVA\6.Scanner demo>java Greatest
Enter any 3 numbers
12
32
23
B is greatest


*/

		