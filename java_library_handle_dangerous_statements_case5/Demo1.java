//Handle Exception finite(limited)times (3/5 attempts)---> Recommended

package java_library_handle_dangerous_statements_case5;

import java.util.Scanner;

//copy programs from case3
public class Demo1
{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1 st number ...");
		int a =sc.nextInt();
		
		System.out.println("Enter 2 nd number ...");
		int b =sc.nextInt();
		
		//we are giving infinite chances for the user to enter correct value 
		//while (true) or for(;;) is given as a infinite loop
		
		while(true)
		{

			/*try block will try to handle the dangerous statement ...if it is acting abnormally ...
			it(jvm) will create an exception object and throw that object (object address)*/
			try 
			{
				int c=a/b; //dangerous statement
				System.out.println("Division result :"+c);
				break;// when both values are correct exit out of the infinite loop
			}
			
			/*catch block  will catch the object address and store in a object refrence variable ...and
			  we store objects of specific datatype ..yeah !...so, we need to create 
			  ArithmeticException object refrence variable*/
			
			catch(ArithmeticException orv)
			{
				System.out.println("Second number cannot be zero");
				System.out.println("lee User reenter the second number");
				
				//giving 3 chances
				for(int j=3;j>=1;j--)
				{
					System.out.println(+j+" no of attempts left");
					b =sc.nextInt();// we are using the same b object instead of creating a new object
					
				}
				
				System.out.println("Your account is blocked by ethical hackers");
				break;
				//System.out.println("Pls wait for 15 sec ");
				//Thread.sleep(15000);//15 sec gap after 10 attempts
				//System.out.println("Timer completed .... ");
				
				//code reusage is done here instead of code repeatability
				//int c=a/b; //dangerous statement
				//System.out.println("Division result :"+c);
				
			}
		}
		
		
	}

}
