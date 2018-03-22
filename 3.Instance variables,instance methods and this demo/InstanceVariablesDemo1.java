/*Program to demonstrate the accessing of instance varisables */

class D
{
	int a=20; //Instance variable
	
	void method(int a)
	{
		System.out.println("a="+a);
		a=a;
		System.out.println("a="+a);
		a++;
		System.out.println("a="+a);
	}
}

class InstanceVariablesDemo1
{
	public static void main(String[]args)
	{
		D obj=new D();
		obj.method(10);
		System.out.println(obj.a);
	}
}


/*Output:

F:\NIIT\JAVA>javac InstanceVariablesDemo1.java

F:\NIIT\JAVA>java InstanceVariablesDemo1
a=10
a=10
a=11
20

*/