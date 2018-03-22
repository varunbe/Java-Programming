//Multiple threads acting on a single object
class Reserve implements Runnable
{
	int available=2;
	int wanted;
	Reserve(int i)
	{
		wanted=i;
	}
	public void run()
	{
		synchronized(this)
		{
			String name=null;
			System.out.println("Number of berths available="+available);
			name=Thread.currentThread().getName();
			
			if(available>=wanted)
			{
				System.out.println(wanted+ "berths alloted for "+name);
				try
				{
					Thread.sleep(200);
					available=available-wanted;
				}
				catch(InterruptedException ie)
				{
				}
			}
			else
			{
				System.out.println("Sorry no berths available");
			}
		}
	}
}
class Safe
{
	public static void main(String[]args)
	{
		//Specify 1 berth is necessary
		Reserve obj=new Reserve(1);
		
		//Create 3 threads
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		Thread t3=new Thread(obj);
		
		//Give names to threads
		t1.setName("First");
		t2.setName("Second");
		t3.setName("Third");
		
		t1.start();
		t2.start();
		t3.start();
	}
}


/*Output:


F:\NIIT\JAVA\18.Threads>javac Safe.java

F:\NIIT\JAVA\18.Threads>java Safe
Number of berths available=2
1berths alloted for Second
Number of berths available=1
1berths alloted for Third
Number of berths available=0
Sorry no berths available

*/