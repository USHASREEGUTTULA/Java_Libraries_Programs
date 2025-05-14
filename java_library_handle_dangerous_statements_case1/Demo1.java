
//In notes heading

//Handle Exception only once----> Not recommended

package java_library_handle_dangerous_statements_case1;

import java.util.Scanner;

public class Demo1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1 st number ...");
		int a =sc.nextInt();
		
		System.out.println("Enter 2 nd number ...");
		int b =sc.nextInt();
		
		/*try block will try to handle the dangerous statement ...if it is acting abnormally ...
		it(jvm) will create an exception object and throw that object (object address)*/
		try 
		{
			int c=a/b; //dangerous statement
			System.out.println("Division result :"+c);
		}
		/*catch block  will catch the object address and store in a object refrence variable ...and
		  we store objects of specific datatype ..yeah !...so, we need to create 
		  ArithmeticException object refrence variable*/
		catch(ArithmeticException orv)
		{
			System.out.println("Second number cannot be zero");
			System.out.println("lee User reenter the second number");
			b =sc.nextInt();// we are using the same b object instead of creating a new object
			int c=a/b; //dangerous statement
			System.out.println("Division result :"+c);
			
		}
		
		
	}

}