package java_library_identify_dangerous_statements;

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
		
		int c=a/b; //dangerous statement
		System.out.println("Division result :"+c);
		
	}

}
