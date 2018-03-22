/*
Program to demonstrate multiple inheritance using interfaces in java
*/

interface Father
{   //variables are public,static and final
	int property1=500000;
	float height1=6.2f;
}
interface Mother
{
	int property2=300000;
	float height2=5.6f;
}
class Child implements Father,Mother
{
	void property()
	{
		System.out.println("Child property="+(property1+property2));
	}
	void height()
	{
		System.out.println("Height="+(height1+height2)/2);
	}
}
class MultipleInheritanceDemo
{
	public static void main(String[]args)
	{
		Child c=new Child();
		c.property();
		c.height();
	}
}	

/*Output:


F:\NIIT\JAVA\17.Interfaces>javac MultipleInheritanceDemo.java

F:\NIIT\JAVA\17.Interfaces>java MultipleInheritanceDemo
Child property=800000
Height=5.8999996

*/