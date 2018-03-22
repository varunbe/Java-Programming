/*
Program to demonstrate accesing private variables
*/

class C
{
	private int a=10;
	
	void method()
	{
		System.out.println("a="+a);
	}
}

class PrivateDemo
{
	public static void main(String[]args)
	{
		C obj=new C();
		obj.method();
		//System.out.println("a="+obj.a);//Compilation error
	}
}


/*Output:


F:\NIIT\JAVA\9.Access specifiers>javac PrivateDemo.java

F:\NIIT\JAVA\9.Access specifiers>java PrivateDemo
a=10

*/