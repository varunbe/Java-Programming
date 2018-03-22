import java.util.Scanner;
class Reverse
{
	public static void main(String[]args)
	{
		System.out.println("Enter any number");
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int r,reverse;
		reverse=0;
		int i;

		while(n>0)
		{
			r=n%10;
			reverse=reverse*10+r;
			n=n/10;
		}
		System.out.println("Reverse of number is:"+reverse);
	}
}

/*Output:

F:\NIIT\JAVA\6.Scanner demo>javac Reverse.java

F:\NIIT\JAVA\6.Scanner demo>java Reverse
Enter any number
1234
Reverse of number is:4321


*/
