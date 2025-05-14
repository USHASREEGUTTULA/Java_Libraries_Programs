package java_library_handle_dangerous_statements_case3;

import java.util.Scanner;

public class Demo4 
{
	public static void main(String[] args) 
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
			 index =sc.nextInt();
//			 System.out.println(s.charAt(index));
		}
	}
		
	}

}
