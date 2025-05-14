package java_library_handle_dangerous_statements_case2;

import java.util.Scanner;

public class Demo2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string to convert into integer ...");
		String s=sc.next();
		try
		{
			int i=Integer.parseInt(s); //dangerous statement
			
			System.out.println("Integer value is :"+i);
			
		}
		catch(NumberFormatException orv)
		{
			System.out.println("You have entered String data in the String object ");
			System.out.println("You have to enter Integer data in the String object ");
			System.out.println("RheeEnter a string to convert into integer ...");
			s=sc.next();
			try
			{
				int i=Integer.parseInt(s); // again dangerous statement
				
				System.out.println("Integer value is :"+i);
			}
			catch(NumberFormatException orv1)
			{
				System.out.println("You have entered String data in the String object ");
				System.out.println("You have to enter Integer data in the String object ");
				System.out.println("ReEnter a string to convert into integer ...");
				s=sc.next();
				int i=Integer.parseInt(s); //dangerous statement

				System.out.println("Integer value is :"+i);
			}
			
		}
		
	}

}
