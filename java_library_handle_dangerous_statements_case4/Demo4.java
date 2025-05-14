package java_library_handle_dangerous_statements_case4;

import java.util.Scanner;

public class Demo4 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string  ...");
		String s=sc.next();
		
		System.out.println("Enter index value  ...");
		int index =sc.nextInt();
	while(true)
	{
		try
		{
			System.out.println(s.charAt(index)); //dangerous statement	
			break;
		}
		catch(StringIndexOutOfBoundsException orv)
		{
			System.out.println("U have entered the index value out of the array size ");
			System.out.println("ReEnter index of an array to fetch the value  ...");
			
			//giving 10 chances
				for(int i=10;i>=1;i--)
				{
					System.out.println(+i+" no of attempts left");
					 index =sc.nextInt();
				}
				
				System.out.println("Pls wait for 15 sec ");
				
				for(int j=15;j>=1;j--)
				{
				Thread.sleep(1000);//15 sec gap after 10 attempts
				System.out.println(+j+"seconds left...");
				}
				System.out.println("Timer completed .... ");
			 
//			 System.out.println(s.charAt(index));
		}
	}
		
	}

}
