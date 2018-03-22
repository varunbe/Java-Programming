/*
Program to demonstrate use of delimiter
*/

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DelimiterDemo
{
	public static void main(String[]args)throws IOException
	{
		FileWriter fout=new FileWriter("test.txt");
		fout.write("2,3.4,  5,6, 7.4,9.1,10.5,done");
		fout.close();

		FileReader fin=new FileReader("test.txt");
		Scanner obj=new Scanner(fin);

		//Set delimiter to space and comma
		//", *"tells Scanner to match a comma and zero or more spaces as delimiters

		obj.useDelimiter(", *");
		
     		//Read and sum numbers

		while(obj.hasNext())
		{
			if(obj.hasNextDouble())
			{
				System.out.println(obj.nextDouble());
			}
			else
			{
				break;
			}
		}
		fin.close();
	}
}


/*Output:

F:\NIIT\JAVA\7.Delimiter>javac DelimiterDemo.java

F:\NIIT\JAVA\7.Delimiter>java DelimiterDemo
2.0
3.4
5.0
6.0
7.4
9.1
10.5

*/