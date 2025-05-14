package java_library_identify_dangerous_statements;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of an array  ...");
		int size =sc.nextInt();
		
		int [] a1=new int[size];
		
		System.out.println("Enter "+a1.length+"elements");
		for(int i=0;i<=a1.length-1;i++)
		{
			System.out.println("Enter the element  ...");
			a1[i]=sc.nextInt();
		}
	
		System.out.println("Array entry is completed");
	
		System.out.println("Enter index of an array to fetch the value  ...");
		int index =sc.nextInt();
		
		System.out.println(a1[index]);//dangerous statement
		
	}

}
