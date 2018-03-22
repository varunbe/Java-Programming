/*
Program to demonstrate user defined exceptions
*/

class MyOwnException extends Exception
{
	public MyOwnException(String msg)
	{
		super(msg);
	}
}
class UsedDefinedExceptionsDemo
{
	static void employeeAge(int age)throws MyOwnException //This is user defined exception,so we have to handle it
	{
		if(age<0)
		{
			throw new MyOwnException("Age can't be less than zero");
		}
		else
		{
			System.out.println("Input is valid");
		}	
	}	
	public static void main(String[]args)
	{
		try
		{
			employeeAge(-2);
		}
		catch(MyOwnException e)
		{
			e.printStackTrace();
		}
		
	}
}	
		