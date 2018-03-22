/*
Program to test various methods using Character
*/

import java.io.*;

class CharTest
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
			System.out.println("Please enter a char:");
			char ch=(char)br.read();  //read() returns integer type..so we use (char) to typecast 
		
			if(Character.isDigit(ch))
			{
				System.out.println("It is a digit");
			}
			else if(Character.isUpperCase(ch))
			{
				System.out.println("It is an upper case letter");
			}
			else if(Character.isLowerCase(ch))
			{
				System.out.println("It is a lower case letter");
			}
			else if(Character.isWhitespace(ch))
			{
				System.out.println("You typed enter or tab button");
			}
			else if(Character.isSpaceChar(ch))
			{
				System.out.println("It is from space bar");
			}		
			else
			{
				System.out.println("Sorry..unable to recognize the character");
			}
		
	}		
}		

/*Output:

F:\NIIT\JAVA\14.Wraper classes>javac CharTest.java

F:\NIIT\JAVA\14.Wraper classes>java CharTest
Please enter a char:
1
It is a digit

F:\NIIT\JAVA\14.Wraper classes>java CharTest
Please enter a char:
a
It is a lower case letter

F:\NIIT\JAVA\14.Wraper classes>java CharTest
Please enter a char:
A
It is an upper case letter

F:\NIIT\JAVA\14.Wraper classes>java CharTest
Please enter a char:

You typed enter or tab button

F:\NIIT\JAVA\14.Wraper classes>java CharTest
Please enter a char:
!
Sorry..unable to recognize the character

*/