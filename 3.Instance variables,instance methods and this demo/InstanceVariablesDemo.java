/*Program to demonstrate the accessing of instance varisables */

class D
{
	int a=20; //Instance variable
	
	void method(int b)
	{
		System.out.println("a="+a);
		a=b;
		System.out.println("a="+a);
		a++;
		System.out.println("a="+a);
	}
}

class InstanceVariablesDemo
{
	public static void main(String[]args)
	{
		D obj=new D();
		obj.method(10);
		System.out.println(obj.a);
	}
}

/*Output:

F:\NIIT\JAVA>javac InstanceVariablesDemo.java

F:\NIIT\JAVA>java InstanceVariablesDemo
a=20
a=10
a=11
11

*/