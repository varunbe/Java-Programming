/*
Program for converting decimal numbers to other number systems
*/

import java.io.*;
class Convert
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any number:");
		String str=br.readLine();
		int n=Integer.parseInt(str);
		System.out.println("In decimal : "+n);
		
		str=Integer.toBinaryString(n);
		System.out.println("In binary : "+str);
		str=Integer.toHexString(n);
		System.out.println("In hexadecimal : "+str);
		str=Integer.toOctalString(n);
		System.out.println("In octal : "+str);
	}
}

/*Output:


F:\NIIT\JAVA\14.Wraper classes>javac Convert.java

F:\NIIT\JAVA\14.Wraper classes>java Convert
Enter any number:
2
In decimal : 2
In binary : 10
In hexadecimal : 2
In octal : 2

F:\NIIT\JAVA\14.Wraper classes>java Convert
Enter any number:
45
In decimal : 45
In binary : 101101
In hexadecimal : 2d
In octal : 55


*/	
		