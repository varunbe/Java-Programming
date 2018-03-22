/*
Program to demonstrate ArithematicException
*/

class Demo1
{
	public static void main(String[]args)
	{
		System.out.println("Open the files..");
		int n=args.length;
		System.out.println("Number of args are:"+n);
		int a=45/n;
		System.out.println("The value of a="+a);
		System.out.println("Close the files..");
	}
}
	
/*Output:


F:\NIIT\JAVA\12.Exception handling>javac Demo1.java

F:\NIIT\JAVA\12.Exception handling>java Demo1
Open the files..
Number of args are:0
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Demo1.main(Demo1.java:8)

*/		