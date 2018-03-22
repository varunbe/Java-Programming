//Hash map

import java.io.*;
import java.util.*;

class HashMapDemo
{
	public static void main(String[]args)throws IOException
	{
		HashMap hm=new HashMap();
		String name,str;
		Long phno;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		//Menu
		while(true)
		{
			System.out.println("1.Save any phone number");
			System.out.println("2.Search the phone number");
			System.out.println("3.Exit");
			System.out.println("Enter the action to be performed...\n");
			
			int n=Integer.parseInt(br.readLine());
			
			switch(n)
			{
				case 1:
					System.out.println("Enter name");
					name=br.readLine();
					System.out.println("Enter the phone number");
					str=br.readLine();
					phno=new Long(str);
					hm.put(name,phno);//here name is key and phno is value(to search phone number by giving name as input)
					break;
					
				case 2:
					System.out.println("Enter any name");
					name=br.readLine();
					phno=(Long)hm.get(name);
					System.out.println("Phone number :"+phno);
					break;
					
				default:
				return;	
			}
		}	
	}
}	


/*Output:


F:\NIIT\JAVA\19.Collection Framework>javac HashMapDemo.java
Note: HashMapDemo.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

F:\NIIT\JAVA\19.Collection Framework>java HashMapDemo
1.Save any phone number
2.Search the phone number
3.Exit
Enter the action to be performed...

1
Enter name
varun
Enter the phone number
9032693449
1.Save any phone number
2.Search the phone number
3.Exit
Enter the action to be performed...

2
Enter any name
varun
Phone number :9032693449
1.Save any phone number
2.Search the phone number
3.Exit
Enter the action to be performed...

3

F:\NIIT\JAVA\19.Collection Framework>


*/