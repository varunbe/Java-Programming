//Hashtable

import java.util.Hashtable;
import java.util.Enumeration;

class HashtableDemo
{
	public static void main(String[]args)
	{
		Hashtable marks=new Hashtable();
		String key;
		
		marks.put("Varun",70);//Key,value
		marks.put("Ram",70);
		marks.put("Ravi",60);
		marks.put("Ajay",70);
		marks.put("Krishna",75);
		
		//Show all marks in hash table
		
		Enumeration names=marks.keys();
		while(names.hasMoreElements())
		{
			key=(String)names.nextElement();
			System.out.println(key+ " :" +marks.get(key));
		}
		System.out.println("Ajay :"+marks.get("Ajay"));
		System.out.println("\n" +marks.hashCode());
	}
}	

/*Output:


F:\NIIT\JAVA\19.Collection Framework>javac HashtableDemo.java
Note: HashtableDemo.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

F:\NIIT\JAVA\19.Collection Framework>java HashtableDemo
Ravi :60
Varun :70
Krishna :75
Ajay :70
Ram :70
Ajay :70

1294610596

*/