/*
Program to show private access
*/

class D
{
	private int a=10;
	void method()	
	{
		System.out.println("a="+a);
	}
	private void method1(int b)
	{
		System.out.println("b="+b);
	}
	
	public static void main(String[]args)
	{
		D obj =new D();
		obj.method();
		obj.method1(20);
		s();
		//System.out.println("a="+obj.a);
	}
	
	static void s()
	{
		D obj1=new D();
		obj1.method();
		obj1.method1(30);
	}
}


/*Output:

F:\NIIT\JAVA\9.Access specifiers>javac D.java

F:\NIIT\JAVA\9.Access specifiers>java D
a=10
b=20
a=10
b=30

*/
