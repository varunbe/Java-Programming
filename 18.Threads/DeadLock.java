import java.io.*;
//To cancel a ticket
class CancelTicket extends Thread
{
	String s1,s2;
	CancelTicket(String s1,String s2)
	{
		this.s1=s1;
		this.s2=s2;
	}
	public void run()	
	{
		synchronized(s1)
		{
			System.out.println("Cancle ticket has locked on:"+s1);
			try
			{
				sleep(200);
			}
			catch(InterruptedException e)
			{
			}
			System.out.println("Cancel ticket wants to lock on:"+s2);
			synchronized(s2)
			{
				System.out.println("**Cancel ticket is locked on:"+s2);
			}
		}
	}
}
//To book the ticket
class BookTicket extends Thread
{
	String s1,s2;
	BookTicket(String s1,String s2)
	{
		this.s1=s1;
		this.s2=s2;
	}
	public void run()
	{
		synchronized(s2)
		{
			System.out.println("Book ticket has locked on:"+s2);
			try
			{
				sleep(100);
			}
			catch(InterruptedException e)
			{
			}
			System.out.println("Book ticket wants to lock:"+s1);
			synchronized(s1)
			{
				System.out.println("Book ticket has locked on:"+s1);
			}
		}
	}
}
class DeadLock
{
	public static void main(String[]args)
	{
		String s1="compartment";
		String s2="train";
		
		//Create objects to cancel tickets
		CancelTicket obj=new CancelTicket(s1,s2);
		BookTicket obj1=new BookTicket(s1,s2);
		
		//Create two threads and attach them to obj and obj1
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj1);
		
		//Run the methods
		t1.start();
		t2.start();
		//System.in.exit();
	}
}
	
	
	
/*Output:


F:\NIIT\JAVA\18.Threads>javac DeadLock.java

F:\NIIT\JAVA\18.Threads>java DeadLock
Book ticket has locked on:train
Cancle ticket has locked on:compartment
Book ticket wants to lock:compartment
Cancel ticket wants to lock on:train


*/	