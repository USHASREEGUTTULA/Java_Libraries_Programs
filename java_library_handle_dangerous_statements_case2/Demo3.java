package java_library_handle_dangerous_statements_case2;

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
		try
		{
			System.out.println(a1[index]);//dangerous statement
		}
		catch(ArrayIndexOutOfBoundsException orv)
		{
			System.out.println("U have entered the index value out of the array size ");
			System.out.println("ReEnter index of an array to fetch the value  ...");
			 index =sc.nextInt();
			 try
			 {
				 System.out.println(a1[index]); 
			 }
			 catch(ArrayIndexOutOfBoundsException orv1)
			 {
				System.out.println("U have entered the index value out of the array size ");
				System.out.println("ReEnter index of an array to fetch the value  ...");
				index =sc.nextInt();
				System.out.println(a1[index]); 
			 }
			 
		}
		
		
	}

}
