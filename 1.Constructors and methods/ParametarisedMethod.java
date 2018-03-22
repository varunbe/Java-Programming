/* Demo for parametarised methods */

class M
{
	void add(int a,int b)
		{
			int c;
			c=a+b;
			System.out.println("Sum="+c);
		}
}

class ParametarisedMethod
{
	public static void main(String[]args)
	{
		M obj=new M();
		obj.add(5,6);
	}
}


/*Output:

F:\NIIT\JAVA>javac ParametarisedMethod.java

F:\NIIT\JAVA>java ParametarisedMethod
Sum=11

*/