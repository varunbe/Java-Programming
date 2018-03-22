/*Array List*/

import java.util.ArrayList;

public class ArrayListDemo
{
	public static void main(String[]args)
	{
		ArrayList a1=new ArrayList();
		System.out.println("Initial size is:"+a1.size());
		
		//Add elements to ArrayList
		a1.add("D");
		a1.add("A");
		a1.add("C");
		a1.add("B");
		a1.add(2,"E");//It adds element at second position
		
		System.out.println("Size="+a1.size());
		System.out.println("Contents of a1:"+a1);
		
		//Remove elements from ArrayList
		a1.remove("A");
		a1.remove(2);
		System.out.println("Size="+a1.size());
		System.out.println("Contents of a1:"+a1);
	}
}


/*Output:


F:\NIIT\JAVA\19.Collection Framework>javac ArrayListDemo.java
Note: ArrayListDemo.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

F:\NIIT\JAVA\19.Collection Framework>java ArrayListDemo
Initial size is:0
Size=5
Contents of a1:[D, A, E, C, B]
Size=3
Contents of a1:[D, E, B]

*/	