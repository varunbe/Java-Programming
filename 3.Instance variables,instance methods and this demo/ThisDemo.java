/*Program to demonstrate the accessing of instance varisables */

class D
{
	int a=20; //Instance variable
	
	void method(int a)
	{
		System.out.println("a="+a);
		this.a=a;
		System.out.println("a="+a);
		a++;
		System.out.println("a="+a);
	}
}

class ThisDemo
{
	public static void main(String[]args)
	{
		D obj=new D();
		obj.method(10);
		System.out.println(obj.a);
	}
}


/*output:

F:\NIIT\JAVA>javac ThisDemo.java

F:\NIIT\JAVA>java ThisDemo
a=10
a=10
a=11
10

*/