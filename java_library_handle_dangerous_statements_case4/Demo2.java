package java_library_handle_dangerous_statements_case4;

import java.util.Scanner;

public class Demo2 
{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string to convert into integer ...");
		String s=sc.next();
		
		while(true)
		{
		try
		{
			int k=Integer.parseInt(s); //dangerous statement
			System.out.println("Integer value is :"+k);
			break;
		}
		catch(NumberFormatException orv)
		{
			System.out.println("You have entered String data in the String object ");
			System.out.println("You have to enter Integer data in the String object ");
			System.out.println("ReEnter a string to convert into integer ...");
			
			//giving 10 chances
			for(int i=10;i>=1;i--)
			{
				System.out.println(+i+" no of attempts left");
				s=sc.next();
			}
			
			System.out.println("Pls wait for 15 sec ");
			
			for(int j=15;j>=1;j--)
			{
			Thread.sleep(1000);//15 sec gap after 10 attempts
			System.out.println(+j+"seconds left...");
			}
			System.out.println("Timer completed .... ");
			
//			int i=Integer.parseInt(s); //dangerous statement
		
//			System.out.println("Integer value is :"+i);
		}
		}
		
	}

}
