package java_library_custom_exception;

public class Demo 
{
	public static void main(String[] args) 
	{
		try 
		{
			System.out.println("In try block");
			System.out.println(10/2);//without exception ,obj is not created
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
