/*
Program to demonstrate method overriding 
*/

//Method overriding

class One
{
	void calculate(double x)
	{
		System.out.println("Square of number is"+(x*x));
	}
}

class Two extends One
{
	void calculate(double x)
	{
		super.calculate(x);
		System.out.println("Square root value is:"+Math.sqrt(x));
	}
}
	
class MethodOverridingDemo
{
	public static void main(String[]args)
	{
		Two t=new Two();
		t.calculate(25);
		t.calculate(30);
	}
}	


/*Output:


F:\NIIT\JAVA\10.Method overloading and overriding>javac MethodOverridingDemo.jav
a

F:\NIIT\JAVA\10.Method overloading and overriding>java MethodOverridingDemo
Square of number is625.0
Square root value is:5.0
Square of number is900.0
Square root value is:5.477225575051661

F:\NIIT\JAVA\10.Method overloading and overriding>

*/