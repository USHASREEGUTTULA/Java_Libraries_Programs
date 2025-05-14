//Handle Exception more than once using nested try catch block---->Not recommended

/*
 Note: There are aome project requirements,we must use nested try catch,only in that case use it
 */

package java_library_handle_dangerous_statements_case2;

import java.util.Scanner;
//copy programs from case1
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
			
			/* 2 nd time also if the user reenters the 2 nd number as 0 thn again ,
			  jvm have to create an exception object and throw ,and to catch that object we need 
			  try and catch block should be there*/
			
			try
			{
				int c=a/b; // again dangerous statement
				System.out.println("Division result :"+c);
			}
			catch(ArithmeticException orv1)
			{
				System.out.println("Second number cannot be zero");
				System.out.println("lee User reenter the second number");
				b =sc.nextInt();// we are using the same b object instead of creating a new object
				int c=a/b; // again dangerous statement
				System.out.println("Division result :"+c);

			}
			
			
		}
		
		
	}

}











