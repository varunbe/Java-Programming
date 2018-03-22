/*
Program to print prime numbers upto 100
*/

class PrimeNumbers
{
	public static void main(String[]args)
	{
		int i,j,c;
		System.out.println("Prime numbers between 1 to 100 are: \n");
		
		for(i=2;i<=100;i++)
		{
			c=0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					c++;
				}
			}
			
			if(c==2)
			{
				System.out.println(" " +i);
			}
		}
	}
}


/*Output:

F:\NIIT\JAVA\6.Scanner demo>javac PrimeNumbers.java

F:\NIIT\JAVA\6.Scanner demo>java PrimeNumbers
Prime numbers between 1 to 100 are:

 2
 3
 5
 7
 11
 13
 17
 19
 23
 29
 31
 37
 41
 43
 47
 53
 59
 61
 67
 71
 73
 79
 83
 89
 97

*/