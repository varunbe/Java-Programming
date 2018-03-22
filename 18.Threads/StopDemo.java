//Creating,running and stoping a thread
import java.io.*;

class MyThread extends Thread
{
	boolean stop=false;
	public void run()
	{
		for(int i=0;i<10000;i++)
		{
			System.out.println(i);
			if(stop)
			{
				return;
			}
		}
	}
}
class StopDemo
{
	public static void main(String[]args)
	{
		MyThread obj=new MyThread();
		Thread t=new Thread(obj);
		t.start();
		//System.exit();
		//obj.stop=true;
	}
}