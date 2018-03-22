/* Program to check validity of special symbols as starting characters for identifiers */


/* The symbols _ and $ can even be used as a starting letter,but can't have # and @ as starting letters */

class $s
{	
	void $s() 
	{
		System.out.println("Dollar");
	}
}

class IdentifiersDemo
{
	public static void main(String[]args)
	{
		int _a=10;
		$s obj=new $s();
		obj.$s();

		System.out.println("String");
		System.out.println("_a="+_a);
	}
}

/*Output:


F:\NIIT\JAVA\4.Identifiers>javac IdentifiersDemo.java

F:\NIIT\JAVA\4.Identifiers>java IdentifiersDemo
Dollar
String
_a=10

*/