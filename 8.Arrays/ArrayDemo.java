/*
Program to demonstrate use of arrays
*/

class ArrayDemo
{
	public static void main(String[]args)
	{
		//Declaration of array
		//int arr[];
		
		//Declaration and initialisation of array	
		int arr[]=new int[10];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		
		//Dynamic initialisation
		System.out.println("\n\nInitialisation...");
		int arr2[]=new int[]{10,20,30,40,50,60,70,80,90,100};

		for(int i=0;i<arr2.length;i++)
		{
			arr[i]=arr2[i];
			System.out.println(" " +arr[i]);
		}
	
		System.out.println("\n\nString array...");
		
		String days[]=new String[]{"sun","mon","tue","wed","thu","fri","sat"};
		for(int i=0;i<days.length;i++)
		{
			System.out.println(" "+days[i]);
		}
		
		System.out.println("\nAccesing elements beyond range");
		//System.out.println(days[8]); //ArrayIndexOutOfBound exception
		
		System.out.println("\n\nInitialisation..");
		{
			//arr[]=new int[5]; //This is not allowed
			arr=new int[5];
			
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=arr2[i];
				System.out.print(" " +arr[i]);
			}
		}
	}
}

/*Output:


F:\NIIT\JAVA\8.Arrays>javac ArrayDemo.java

F:\NIIT\JAVA\8.Arrays>java ArrayDemo
0000000000

Initialisation...
 10
 20
 30
 40
 50
 60
 70
 80
 90
 100


String array...
 sun
 mon
 tue
 wed
 thu
 fri
 sat

Accesing elements beyond range


Initialisation..
 10 20 30 40 50

*/		