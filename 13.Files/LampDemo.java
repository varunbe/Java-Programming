/*Program to zip the file*/

import java.io.*;
import java.util.zip.*;

class LampDemo
{
	public static void main(String[]args)throws IOException
	{
		FileInputStream fis=new FileInputStream("FileDemo.java");
		GZIPOutputStream g=new GZIPOutputStream(new FileOutputStream("e.zip"));
		
		int i;
		while(((i=fis.read())!=-1))
		{
			g.write((char)i);
		}
		System.out.println("Check the folder..u will find a new zip folder");
		fis.close();
		g.close();
	}
}	

/*Output:


F:\NIIT\JAVA\13.Files>javac LampDemo.java

F:\NIIT\JAVA\13.Files>java LampDemo
Check the folder..u will find a new zip folder

*/