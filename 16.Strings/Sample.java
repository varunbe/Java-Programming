/*
Program to check wheter two strings are equal or not
*/

class Sample
{
	public static void main(String[]args)
	{
		String s1=new String("Hello");
		String s2=new String("Hello");
		
		if(s1==s2) //It compares the name of the objects
		{
			System.out.println("Both are equal");
		}
		else
		{
			System.out.println("Not equal");
		}
		
		if(s1.equals(s2))  //It compares the content
		{
			System.out.println("Both are equal");
		}
		else
		{
			System.out.println("Not equal");
		}
	}
}	

/*Output:


F:\NIIT\JAVA\16.Strings>javac Sample.java

F:\NIIT\JAVA\16.Strings>java Sample
Not equal
Both are equal

*/