/*
Program to demonstrate throws
*/

import java.io.*;
class Sample
{
	void accept()throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name");
		String str=br.readLine();
		System.out.println("Hello "+" " +str);
	}
}	
class ThrowsDemo
{
	public static void main(String[]args)throws IOException
	{
		Sample s=new Sample();
		s.accept();
	}
}

/*Output:

F:\NIIT\JAVA\12.Exception handling>javac ThrowsDemo.java

F:\NIIT\JAVA\12.Exception handling>java ThrowsDemo
Enter your name
varun
Hello  varun

*/	