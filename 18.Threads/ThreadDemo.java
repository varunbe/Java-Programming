/*
Program to implement multi tasking with multi threading
*/

class Theater implements Runnable
{
	String str;
	Theater(String str)
	{
		this.str=str;
	}

	//A thread can run only public void method.If we write another method,we write within public void run()
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(str+" : " +i);
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
	}
}
class ThreadDemo
{
	public static void main(String[]args)
	{
		Theater obj1=new Theater("Cut ticket");
		Theater obj2=new Theater("Show chair");
		Theater obj3=new Theater("Exit");
			
		//create two threads and attach to those objects
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		Thread t3=new Thread(obj3);			
	
		//Run the threads simultaneously
		t1.start();
		t2.start();
		t3.start();
	}
}	