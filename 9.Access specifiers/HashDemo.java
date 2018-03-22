import java.io.*;
import java.util.*;

class HashDemo
{
	public static void main(String[]args)throws IOException
	{
		HashMap hm=new HashMap();
		String name,str;
		long phno;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		//MENU	
		while(true)
		{
			System.out.println("1.Enter phone number");	
			System.out.println("2.Search phone number");
			System.out.println("3.Exit");
			System.out.println("\n\nEnter your choice");

			int n=Integer.parseInt(br.readLine());
			
			switch(n)
			{
				case 1:
					System.out.println("Enter name");
					name=br.readLine();
					System.out.println("Enter phone number");
					str=br.readLine();
					phno=new Long (str);
					//Here,name is key and value is phone number
					hm.put(name,phno);
					break;

				case 2:		
					System.out.println("Enter name");
					name=br.readLine();
					phno=(long)hm.get(name);
					System.out.println("\n\nPhone number is:"+phno);
					System.out.println();
					break;

				case 3:
					System.exit(0);

				default:
					break;

			}
		}
	}
}


/*Output:


F:\NIIT\JAVA\9.Access specifiers>javac HashDemo.java
Note: HashDemo.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

F:\NIIT\JAVA\9.Access specifiers>java HashDemo
1.Enter phone number
2.Search phone number
3.Exit


Enter your choice
1
Enter name
varun
Enter phone number
9032693449
1.Enter phone number
2.Search phone number
3.Exit


Enter your choice
1
Enter name
tarush
Enter phone number
9642504752
1.Enter phone number
2.Search phone number
3.Exit


Enter your choice
1
Enter name
vamshi
Enter phone number
9000305454
1.Enter phone number
2.Search phone number
3.Exit


Enter your choice
2
Enter name
vamshi


Phone number is:9000305454

1.Enter phone number
2.Search phone number
3.Exit


Enter your choice
2
Enter name
varun


Phone number is:9032693449

1.Enter phone number
2.Search phone number
3.Exit


Enter your choice
2
Enter name
tarush


Phone number is:9642504752

1.Enter phone number
2.Search phone number
3.Exit


Enter your choice
3


*/			