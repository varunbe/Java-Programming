/*
Program to demonstrate use of delimiter
*/

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Delimiter1
{
	public static void main(String[]args)throws IOException
	{
		FileWriter fout=new FileWriter("cvr.txt");
		fout.write("ds cvr ds ce ds");
		fout.close();

		FileReader fin=new FileReader("cvr.txt");
		Scanner obj=new Scanner(fin);

		//Set delimiter to space and comma
		//"ds ,"tells Scanner to match a comma and zero or more spaces as delimiters

		obj.useDelimiter("ds");
		
     		//Read and sum numbers

		while(obj.hasNext())
		{
			System.out.println(obj.next());
		}
		
		fin.close();
	}
}


/*Output:


F:\NIIT\JAVA\7.Delimiter>javac Delimiter1.java

F:\NIIT\JAVA\7.Delimiter>java Delimiter1
 cvr
 ce

*/