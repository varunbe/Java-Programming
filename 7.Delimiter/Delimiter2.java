/*
Program to demonstrate use of delimiter -- alternate way without using useDelimiter()method
*/


import java.io.*;

public class Delimiter2
{
	public static void main(String args[])
	{
        	String Str = new String("Welcome-to-cvr.ac.in");

		System.out.println("Return Value :" );
       	        for (String retval: Str.split("-", 2))
		{
       			System.out.println(retval);
        	}
        	System.out.println("");
     	   	System.out.println("Return Value :" );
        
		for (String retval: Str.split("-", 3))
		{
        		System.out.println(retval);
      		}
        	System.out.println("");
       	 	System.out.println("Return Value :" );
     
    	    	for (String retval: Str.split("-", 0))
		{
        		System.out.println(retval);
        	}
        	System.out.println("");
        	System.out.println("Return Value :" );
      
		for (String retval: Str.split("-"))
		{
        		System.out.println(retval);
      		}
	}
}



/*Output:

F:\NIIT\JAVA\7.Delimiter>javac Delimiter2.java

F:\NIIT\JAVA\7.Delimiter>java Delimiter2
Return Value :
Welcome
to-cvr.ac.in

Return Value :
Welcome
to
cvr.ac.in

Return Value :
Welcome
to
cvr.ac.in

Return Value :
Welcome
to
cvr.ac.in

*/