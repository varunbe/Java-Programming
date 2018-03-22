class StringMethodsDemo
{
	public static void main(String[]args)
	{	
		String s="Varun Belide";
		System.out.println(s.length());
		System.out.println("hello".length());
		System.out.println(s.charAt(5));
		System.out.println(s.equals("Varun Belide"));
		System.out.println(s.equalsIgnoreCase("varun belide"));
		System.out.println(s.substring(4));
		System.out.println(s.substring(0,2));
		System.out.println(s.replace('V','K'));
		System.out.println("hello".concat("hai"));
		System.out.println(s.toLowerCase());
		System.out.println("welcome".toUpperCase());
		System.out.println("         hai         ".trim());
		System.out.println("Varun Belide".startsWith("Varun"));
		System.out.println("Varun Belide".endsWith("Belide"));
		System.out.println(String.valueOf(100));
	}
}	

/*Output:


F:\NIIT\JAVA\16.Strings>javac StringMethodsDemo.java

F:\NIIT\JAVA\16.Strings>java StringMethodsDemo
12
5

true
true
n Belide
Va
Karun Belide
hellohai
varun belide
WELCOME
hai
true
true
100
*/		