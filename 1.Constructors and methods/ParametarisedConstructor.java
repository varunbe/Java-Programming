/*Demo for parametarised constructor*/

class S
{
	S(String s)
	{
		System.out.println("s= "+s);
	}
}

class ParametarisedConstructor
{
	public static void main(String[]args)
	{
		 S obj=new S("java");
	}
}


/*Output:

F:\NIIT\JAVA>javac ParametarisedConstructor.java

F:\NIIT\JAVA>java ParametarisedConstructor
s= java

*/