/* Demo for static methods */

class N
{
	int d=10; //Instance variable
	N(String s)
	{
		System.out.println("s="+s);
		System.out.println("I'm a constructor");
	}
		
	void method1(int a,int b)
	{
		int c=a+b;
		System.out.println("c="+c);
		
		method2();
	}

	void method2()
	{
		System.out.println("Method 2");
	}
	
	static void method3()
	{
		System.out.println("I'm a static method -->method3");
	}
}

class StaticMethodDemo
{
	public static void main(String[]args)
	{
		N obj=new N("varun");
		obj.method1(10,20);
		System.out.println(obj.d);
	}
}

/*Output:


F:\NIIT\JAVA>javac StaticMethodDemo.java

F:\NIIT\JAVA>java StaticMethodDemo
s=varun
I'm a constructor
c=30
Method 2
10

*/
