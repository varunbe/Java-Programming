/* Program for creation of methods and objects */

class M
{
	M()
	{
		System.out.println("I'm is a constructor");
	}
	void methodName()
	{
		System.out.println("I'm a method");
	}
}
class Demo_method_constructor
{
	public static void main(String[]args)
	{
		M obj=new M();
		obj.methodName();
	}
}



/*Output:

F:\NIIT\JAVA>javac Demo_method_constructor.java

F:\NIIT\JAVA>java Demo_method_constructor
I'm is a constructor
I'm a method

*/
