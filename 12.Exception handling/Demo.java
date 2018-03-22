/*
Program to demonstrate ArrayIndexOutOfBound exception
*/

class Demo
{
	int a[]={1,2,3,4,5};
	void method()
	{
		System.out.println("a="+a[5]);
	}
	public static void main(String[]args)
	{
		Demo d=new Demo();
		d.method();
	}
}

/*Output:
F:\NIIT\JAVA\12.Exception handling>javac Demo.java

F:\NIIT\JAVA\12.Exception handling>java Demo
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
        at Demo.method(Demo.java:10)
        at Demo.main(Demo.java:15)
*/
		
	
