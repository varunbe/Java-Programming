/*
Program to check wheter given number is armstrong or not
*/

import java.util.Scanner;
class Armstrong
{
	public static void main(String[]args)
	{
		int n,sum=0,temp,r;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter any number..");
		n=obj.nextInt();
		temp=n;

		while(temp!=0)
		{
			r=temp%10;
			sum=sum+r*r*r;
			temp=temp/10;
		}

		if(n==sum)
		{
			System.out.println("The number is an armstrong number");
		}
		else
		{
			System.out.println("The number is not an armstrong number");
		}
	}
}


/*Output:


F:\NIIT\JAVA\8.Arrays>javac Armstrong.java

F:\NIIT\JAVA\8.Arrays>java Armstrong
Enter any number..
123
The number is not an armstrong number

F:\NIIT\JAVA\8.Arrays>javac Armstrong.java

F:\NIIT\JAVA\8.Arrays>java Armstrong
Enter any number..

371
The number is an armstrong number

*/