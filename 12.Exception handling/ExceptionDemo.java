/*
Program to demonstrate exception handling
*/

class ExceptionDemo
{
	public static void main(String[]args)
	{
		doStuff();
	}
	public static void doStuff()
	{
		doMoreStuff();
	}
	public static void doMoreStuff()
	{
		System.out.println(10/0);
	}
}

/*Output:

F:\NIIT\JAVA\12.Exception handling>javac ExceptionDemo.java

F:\NIIT\JAVA\12.Exception handling>java ExceptionDemo
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at ExceptionDemo.doMoreStuff(ExceptionDemo.java:17)
        at ExceptionDemo.doStuff(ExceptionDemo.java:13)
        at ExceptionDemo.main(ExceptionDemo.java:9)
*/
		
	
	