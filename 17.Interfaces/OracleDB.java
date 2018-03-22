/*
Program to demonstrate the use of interfaces
*/

class OracleDB implements MyInter
{
	public void connect()
	{
		System.out.println("Connecting to oracle database...");
	}
	public static void main(String[]args)
	{
		OracleDB o=new OracleDB();
		o.connect();
	}
}	

/*Output:


F:\NIIT\JAVA\17.Interfaces>javac OracleDB.java

F:\NIIT\JAVA\17.Interfaces>java OracleDB
Connecting to oracle database...

*/