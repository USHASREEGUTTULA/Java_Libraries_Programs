package java_library_identify_dangerous_statements;

import java.util.Scanner;

public class Demo2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string to convert into integer ...");
		String s=sc.next();
		
		int i=Integer.parseInt(s); //dangerous statement
		
		System.out.println("Integer value is :"+i);
	}

}
