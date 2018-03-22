//Vector Class demo (or) Legacy class demo--->Displayin methods

import java.util.Vector;
import java.util.Enumeration;

public class VectorDemo
{
	public static void main(String[]args)
	{
		//Initial size is 1,increments by 1
		Vector v=new Vector(1,2);
		System.out.println("Initial size="+v.size());
		System.out.println("Initial capacity="+v.capacity());
		
		v.addElement(1);
		v.addElement(2);
		v.addElement(3);
		v.addElement(4);
		
		System.out.println("Size of vector after additions="+v.size());
		System.out.println("Capacity after adding 4 objects="+v.capacity());
		
		v.addElement(6.12);
		v.addElement(7.25);
		v.addElement(12);
		
		System.out.println("Current capacity after additions="+v.capacity());
		System.out.println("First element="+v.firstElement());
		System.out.println("Last element="+v.lastElement());
		
		if(v.contains(4))
			System.out.println("Vector contains element 4");
		
		
		//Enumerate the elements in vector
		Enumeration e=v.elements();
		System.out.println("\nElements in vector:");
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement()+" ");
		}
		
		Vector v1=new Vector();
		System.out.println("Initial size="+v1.size());
		System.out.println("Initial capacity="+v1.capacity());
		
		v1.addElement(100);
		System.out.println("Initial size="+v1.size());
		System.out.println("Initial capacity="+v1.capacity());
	}
}	

/*Output:


F:\NIIT\JAVA\19.Collection Framework>java VectorDemo
Initial size=0
Initial capacity=1
Size of vector after additions=4
Capacity after adding 4 objects=5
Current capacity after additions=7
First element=1
Last element=12
Vector contains element 4

Elements in vector:
1
2
3
4
6.12
7.25
12
Initial size=0
Initial capacity=10
Initial size=1
Initial capacity=100

*/