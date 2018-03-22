//Assign priority to threads

class MyClass extends Thread
{
	int count=0;
	public void run()
	{
		for(int i=0;i<10000;i++)
		{
			count++;
		}
		System.out.println(count);
		System.out.println("Completed thread:"+Thread.currentThread().getName());
		System.out.println("It's priority is:"+Thread.currentThread().getPriority());
	}
}

class Priority
{
	public static void main(String[]args)
	{
		MyClass obj=new MyClass();
		Thread t1=new Thread(obj,"one");
		Thread t2=new Thread(obj,"two");
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.setPriority(5);
		t2.start();
	}
}
	
/*Output:


F:\NIIT\JAVA\18.Threads>javac Priority.java

F:\NIIT\JAVA\18.Threads>java Priority
11968
11968
Completed thread:one
Completed thread:two
It's priority is:10
It's priority is:5

*/	