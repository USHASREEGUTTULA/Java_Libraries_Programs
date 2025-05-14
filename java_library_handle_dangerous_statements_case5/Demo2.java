package java_library_handle_dangerous_statements_case5;

import java.util.Scanner;

public class Demo2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string to convert into integer ...");
		String s=sc.next();
		
		while(true)
		{
		try
		{
			int i=Integer.parseInt(s); //dangerous statement
			
			System.out.println("Integer value is :"+i);
			break;
		}
		catch(NumberFormatException orv)
		{
			System.out.println("You have entered String data in the String object ");
			System.out.println("You have to enter Integer data in the String object ");
			System.out.println("ReEnter a string to convert into integer ...");
			//giving 3 chances
			for(int j=3;j>=1;j--)
			{
				System.out.println(+j+" no of attempts left");
				s=sc.next();// we are using the same b object instead of creating a new object
				
			}
			
			System.out.println("Your account is blocked by ethical hackers");
			break;
			
			
//			int i=Integer.parseInt(s); //dangerous statement
//			
//			System.out.println("Integer value is :"+i);
		}
		}
		
	}

}
