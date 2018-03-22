/*
Program to demonstrate method overloading
*/


//Dynamic polymorphish or method overloading
class Sample
{
	void add(int a,int b)
	{
		System.out.println("SUM="+(a+b));
	}
	void add(int a,int b,int c)
	{
		int d=a+b+c;
		System.out.println("SUM="+d);
	}
}

class MethodOverloadingDemo	
{
	public static void main(String[]args)
	{
		Sample s=new Sample();
		s.add(10,20);
		s.add(10,20,30);
		//s.add(54.32,43.32);
	}
}
	
/*Output:


F:\NIIT\JAVA\10.Method overloading and overriding>javac MethodOverloadingDemo.ja
va

F:\NIIT\JAVA\10.Method overloading and overriding>java MethodOverloadingDemo
SUM=30
SUM=60

*/