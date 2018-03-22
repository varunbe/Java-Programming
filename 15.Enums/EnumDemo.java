/*
Program to demonstrate enums
*/

class EnumDemo
{
	enum Day{Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday};
	public static void main(String[]args)
	{
		Day day1=Day.Tuesday;
		Day day2=Day.Friday;
		
		System.out.println(day1.name());
		System.out.println(day2.name());
		System.out.println(day1.ordinal());
		System.out.println(day2.ordinal());
	}
}
	
/*Output:
	
F:\NIIT\JAVA\15.Enums>javac EnumDemo.java

F:\NIIT\JAVA\15.Enums>java EnumDemo
Tuesday
Friday
2
5

*/