/*
Program to find sum of digits 
*/


import java.util.Scanner;

class SumOfDigits
{
	public static void main(String[]args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=obj.nextInt();
		int r,sum;
		sum=0;
		while(n>0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println("SUM="+sum);
	}
}


/*Output:


F:\NIIT\JAVA\6.Scanner demo>javac SumOfDigits.java

F:\NIIT\JAVA\6.Scanner demo>java SumOfDigits
Enter any number
45
SUM=9


*/