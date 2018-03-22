class Str
{
	public static void main(String[]args)
	{
		//Create string in 3 ways
		String s1="Welcome";
		String s2=new String("to");
		char arr[]={'c','v','r'};
		String s3=new String(arr);
		
		//Display the string
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		System.out.println("s3="+s3);		
		
		//To find no. of characters,we use length() method
		System.out.println("The number of characters in s1 including spaces="+s1.length());
		
		//Join s1 and s2 using concat()method
		System.out.println("s1 joined with s2 and s2 with s3="+s1.concat(s2)+" " +s2.concat(s3));
		
		//Join the strings using +
		System.out.println(s1+s2+s3);
		
		boolean x=s1.startsWith("Welcome");
		if(x)
		System.out.println("s1 starts with Welcome");
		else
		System.out.println("s1 doesn't start with Welcome");
		
		String r=s1.toUpperCase();
		String s=s2.toLowerCase();
		System.out.println("After converting="+r);
		System.out.println("After converting="+s);
	}
}	

/*Output:

F:\NIIT\JAVA\16.Strings>javac Str.java

F:\NIIT\JAVA\16.Strings>java Str
s1=Welcome
s2=to
s3=cvr
The number of characters in s1 including spaces=7
s1 joined with s2 and s2 with s3=Welcometo tocvr
Welcometocvr
s1 starts with Welcome
After converting=WELCOME
After converting=to

*/