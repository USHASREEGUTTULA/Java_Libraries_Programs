package java_library_identify_dangerous_statements;

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
	
		System.out.println(s.charAt(index)); //dangerous statement
	}

}
