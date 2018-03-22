/*
Program to use parseInt to convert String to integer value
*/

import java.io.*;
class Convert
{
	public static void main(String[]args)throws IOException
	{
		InputStreamReader obj=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(obj);
		
		//Convert string to integer
		System.out.println("Enter values of a and b -->Integer values");
		String str1=br.readLine();
		String str2=br.readLine();

		int a=Integer.parseInt(str1);
		int b=Integer.parseInt(str2);
	
		System.out.println("Sum of integer values="+(a+b));
		System.out.println();

		//Convert string to float
		System.out.println("Enter values of c and d -->Float values");
		String s1=br.readLine();
		String s2=br.readLine();

		float c=Float.parseFloat(s1);
		float d=Float.parseFloat(s2);

		System.out.println("Sum of float values=" +(c+d));
		System.out.println();

		
		//Convert string to double
		System.out.println("Enter values of c and d -->Double values");
		String st1=br.readLine();
		String st2=br.readLine();

		double e=Float.parseFloat(st1);
		double f=Float.parseFloat(st2);

		System.out.println("Sum of double values=" +(e+f));
	}
}


/*Output:

F:\NIIT\JAVA\5.Input Stream reader>javac Convert.java

F:\NIIT\JAVA\5.Input Stream reader>java Convert
Enter values of a and b -->Integer values
3
4
Sum of integer values=7

Enter values of c and d -->Float values
3.53
6.2
Sum of float values=9.73

Enter values of c and d -->Double values
43.21
43.54
Sum of double values=86.75

*/