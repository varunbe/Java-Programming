/*
Program to demonstrate multi dimensional arrays
*/


class MultiDimensionalArray //Matrix
{
	public static void main(String[]args)
	{
		int x[][]={{12,32,12},{32,21,43},{43,32,11}};
		System.out.println("In matrix form..");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(x[i][j]+ "\t");
			}
			System.out.println();
		}
		
	}
}


/*Output:


F:\NIIT\JAVA\8.Arrays>javac MultiDimensionalArray.java

F:\NIIT\JAVA\8.Arrays>java MultiDimensionalArray
In matrix form..
12      32      12
32      21      43
43      32      11

*/
