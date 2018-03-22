/*
Program to print prime numbers upto 1000
*/

class P
{
	public static void main(String[]args)
	{
		int i,j,c;
		System.out.println("Prime numbers between 1 to 100 are: \n");
		
		for(i=2;i<=1000;i++)
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
