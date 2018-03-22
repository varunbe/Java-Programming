/* Demo for static variables and methods */

class R
{ 
	static int a=10; //Static variable
	int d=100;       //Instance variable

	void method()  //Instance method
	{
		int b=20; //Local variable
		System.out.println("b="+b); 
		System.out.println("a="+a);  //Accesing static variable
		System.out.println("d="+d);  //Accesing instance variable 
	}

	static void method1()
	{
		int c=20; //Local variable	
		System.out.println("c="+c);
		System.out.println("a="+a); //Accesing static variable
		//System.out.println("d="+d); //Compilation error --->Static method can't access instance variables
	}
}

class StaticVariablesDemo
{
	public static void main(String[]args)
	{
		R obj=new R();
	
		obj.method();  //Object is needed inorder to call instance method
	
		R.method1();  //Static method can be called with class name ---> Static method can be called by class name or object name
 		
		//System.out.println("d="+d); //Compilation error

		System.out.println(obj.d);

		//System.out.println(obj.b); //Compilation error -->can't access local variable

	}
}


/*Output:


F:\NIIT\JAVA>javac StaticVariablesDemo.java

F:\NIIT\JAVA>java StaticVariablesDemo
b=20
a=10
d=100
c=20
a=10
100


*/