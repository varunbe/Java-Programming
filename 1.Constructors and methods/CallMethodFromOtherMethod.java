/*Demo for calling a method from other method */

class X
{
	int d=10; //Instance variable
	
	X(String s)	
	{
		System.out.println("s="+s);
		System.out.println("I'm a constructor");
	}

	void method1(int a,int b) //Instance method
	{
		int c;
		c=a+b;
		System.out.println("c="+c);
		
		method2(); //To call another method
	}
		
	void method2()
	{
		System.out.println("Another method ---> method2 called from method1");
	}
}

class CallMethodFromOtherMethod
{
	public static void main(String[]args)
	{
		X obj=new X("java");
		obj.method1(10,20);
		System.out.println(obj.d);
	}
}


/*Output:

F:\NIIT\JAVA>javac CallMethodFromOtherMethod.java

F:\NIIT\JAVA>java CallMethodFromOtherMethod
s=java
I'm a constructor
c=30
Another method ---> method2 called from method1
10

*/
