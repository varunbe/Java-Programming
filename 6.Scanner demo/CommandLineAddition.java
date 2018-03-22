/*
Program to add 2 values using command line arguments
*/

import java.io.*;

class CommandLineAddition
{
	public static void main(String[]args)
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		System.out.println("SUM="+(a+b));
	}
}


/*Output:


F:\NIIT\JAVA\6.Scanner demo>javac CommandLineAddition.java

F:\NIIT\JAVA\6.Scanner demo>java CommandLineAddition 10 20
SUM=30

*/
