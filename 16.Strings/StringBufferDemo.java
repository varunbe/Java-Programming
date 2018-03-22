/*
Program to demonstrate StringBuffer
*/

class StringBufferDemo
{
	public static void main(String[]args)
	{
		StringBuffer sb=new StringBuffer("Varun");
		System.out.println(sb);
		sb.append("Hyderabad");
		System.out.println(sb);
		sb.insert(7,"belide");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.delete(7,10);
		System.out.println(sb);
		sb.append(sb);
		System.out.println(sb);
	}
}	

/*Output:


F:\NIIT\JAVA\16.Strings>javac StringBufferDemo.java

F:\NIIT\JAVA\16.Strings>java StringBufferDemo
Varun
VarunHyderabad
VarunHybelidederabad
dabarededilebyHnuraV
dabaredlebyHnuraV
dabaredlebyHnuraVdabaredlebyHnuraV


*/