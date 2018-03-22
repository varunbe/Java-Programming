/*
Program to show use of scanner
*/

import java.util.*;
class ScannerDemo
{
	public static void main(String[]args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter any integer value");
		int n=obj.nextInt();
		System.out.println("Enter any float value");
		float b=obj.nextFloat();
		System.out.println("Enter any string ");
		String s=obj.next();
		System.out.println();
		System.out.println(n);
		System.out.println(b);
		System.out.println(s);
	}
}


/*Output:


F:\NIIT\JAVA\6.Scanner demo>javac ScannerDemo.java

F:\NIIT\JAVA\6.Scanner demo>java ScannerDemo
Enter any integer value
45
Enter any float value
5.4322
Enter any string
varun

45
5.4322
varun

*/
