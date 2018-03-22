/*
Program to perform addition of matrices
*/


import java.io.*;
class MatrixAdd
{
	public static void main(String[]args)throws IOException
	{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		

		//Reading no. of rows and columns for matrix1
		System.out.println("Enter number of rows of matrix1");
		int r1=Integer.parseInt(br.readLine());
		System.out.println("Enter number of columns in matrix1");
		int c1=Integer.parseInt(br.readLine());

		//Reading no. of rows and columns for matrix 2 
		System.out.println("Enter number of rows of matrix2");
		int r2=Integer.parseInt(br.readLine());
		System.out.println("Enter number of columns in matrix2");
		int c2=Integer.parseInt(br.readLine());

		if((r1==r2)&&(c1==c2))
		{
			int m1[][]=new int[r1][c1];
			int m2[][]=new int[r2][c2];
			int result[][]=new int[r1][c1];
		
			System.out.println("Enter elements of matrix 1");
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				{
					m1[i][j]=Integer.parseInt(br.readLine());
				}
			}

			System.out.println("Enter elements of matrix 2");
			for(int i=0;i<r2;i++)
			{
				for(int j=0;j<c2;j++)
				{
					m2[i][j]=Integer.parseInt(br.readLine());
				}
			}
		
	
			//Adding two matrices
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				{
					result[i][j]=m1[i][j]+m2[i][j];
				}
			}

			System.out.println("\nMatrix 1: \n");
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				{
					System.out.print(m1[i][j]+ "\t");
				}
				System.out.println();
			}

			System.out.println("\nMatrix 2: \n");
			for(int i=0;i<r2;i++)
			{
				for(int j=0;j<c2;j++)
				{
					System.out.print(m2[i][j]+ "\t");
				}
				System.out.println();
			}

			System.out.println("\nAfter addition:\n");
			for(int i=0;i<r2;i++)
			{
				for(int j=0;j<c2;j++)
				{
					System.out.print(result[i][j]+ "\t");
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("Addition is not possible");
		}
	}
}



/*Output:


F:\NIIT\JAVA\8.Arrays>javac MatrixAdd.java

F:\NIIT\JAVA\8.Arrays>java MatrixAdd
Enter number of rows of matrix1
2
Enter number of columns in matrix1
2
Enter number of rows of matrix2
2
Enter number of columns in matrix2
2
Enter elements of matrix 1
2
2
2
2
Enter elements of matrix 2
2
2
2
2

Matrix 1:

2       2
2       2

Matrix 2:

2       2
2       2

After addition:

4       4
4       4



F:\NIIT\JAVA\8.Arrays>javac MatrixAdd.java

F:\NIIT\JAVA\8.Arrays>java MatrixAdd
Enter number of rows of matrix1
2
Enter number of columns in matrix1
3
Enter number of rows of matrix2
3
Enter number of columns in matrix2
3
Addition is not possible

*/
