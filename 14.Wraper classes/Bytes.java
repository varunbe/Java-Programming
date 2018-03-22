/*
Program for creating and comparing byte objects
*/

import java.io.*;
class Bytes
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a byte number");
		String s1=br.readLine();
		Byte b1=new Byte(s1);
		System.out.println("Enter another byte number");
		s1=br.readLine();
		Byte b2=new Byte(s1);
		int n=b1.compareTo(b2);
		System.out.println();
		System.out.println(n);
		if(n==0)
		{
			System.out.println("Both are equal");
		}	
		else if(n>0)
		{
			System.out.println("b1 is bigger="+b1);
		}	
		else
		{
			System.out.println("b1 is smaller="+b1);
		}
	}
}	

/*Output:

F:\NIIT\JAVA\14.Wraper classes>javac Bytes.java

F:\NIIT\JAVA\14.Wraper classes>java Bytes
Enter a byte number
8
Enter another byte number
5

3
b1 is bigger=8

F:\NIIT\JAVA\14.Wraper classes>javac Bytes.java

F:\NIIT\JAVA\14.Wraper classes>java Bytes
Enter a byte number
3
Enter another byte number
5

-2
b1 is smaller=3

*/