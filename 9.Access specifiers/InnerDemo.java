/*
Program to perform inner class concept to provide more security
*/

//Outer class
class BankAccount
{
	private double bal;
	BankAccount(double bal)
	{
		this.bal=bal;
	}
	
	void start()
	{
		Interest in=new Interest(10.6);
		in.calculateInterest();
	}

	//Inner class
	private class Interest
	{
		double rate;
		Interest(double rate)
		{
			this.rate=rate;
		}
		void calculateInterest()
		{
			double interest=bal*rate/100;
			System.out.println("\nInterest = "+interest);
			bal=bal+interest;
			System.out.println("\nBalance = "+bal);
		}
	}//Inner class
}//Outer class

class InnerDemo
{
	public static void main(String[]args)
	{
		BankAccount act=new BankAccount(10000);
		act.start();
		//System.out.println("Rate="+rate);
	}
}


/*Output:


F:\NIIT\JAVA\9.Access specifiers>javac InnerDemo.java

F:\NIIT\JAVA\9.Access specifiers>java InnerDemo

Interest = 1060.0

Balance = 11060.0

*/