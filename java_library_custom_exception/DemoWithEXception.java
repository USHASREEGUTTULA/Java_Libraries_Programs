package java_library_custom_exception;

public class DemoWithEXception
{
	public static void main(String[] args) 
	{
		try 
		{
			System.out.println("In try block");
			System.out.println(10/0);//with exception
		}
		catch(ArithmeticException orv)
		{
			System.out.println("In catch block");
		}
		finally
		{
			System.out.println("In finally block");
		}
	}

}
