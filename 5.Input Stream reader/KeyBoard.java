/* 
Program to accept data from keyboard using readLine() method 
*/

import java.io.*;
class KeyBoard
{
	public static void main(String[]args)throws IOException
	{
		InputStreamReader obj=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(obj);
		System.out.println("Enter any string");
		String str=br.readLine(); //In case of read() the return type is int,it accepts only one character
		System.out.println(str);
	}
}
		
/*Output:


F:\NIIT\JAVA\5.Input Stream reader>javac KeyBoard.java

F:\NIIT\JAVA\5.Input Stream reader>java KeyBoard
Enter any string
varun
varun

*/