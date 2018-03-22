/*Program to demonstrate special feature of String */
/*String can be used as identifier or keyword */


class FunctionDemo
{
	public static void main(String[]args)
	{
		int String=10;   /* Here,String is an identifier -->It is valid only in case of string.We cannot write int char or char int or int float,etc.It gives an error */
		
		int char=10;  //Error

		
		System.out.println(String);
		//System.out.println(char); 
	}
}

/*Output:


F:\NIIT\JAVA\4.Identifiers>javac FunctionDemo.java

F:\NIIT\JAVA\4.Identifiers>java FunctionDemo
10


*/