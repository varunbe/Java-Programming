/*
Program to demonstrate throw in java
*/

class ThrowDemo
{
	static void demo()
	{
		try
		{
			throw new NullPointerException("mydata");
		}
		catch(NullPointerException ne)
		{
			System.out.println("Exception raised");
		}
	}
	public static void main(String[]args)
	{
		demo();
	}
}	

/*Output:


F:\NIIT\JAVA\12.Exception handling>javac ThrowDemo.java

F:\NIIT\JAVA\12.Exception handling>java ThrowDemo
Exception raised

*/