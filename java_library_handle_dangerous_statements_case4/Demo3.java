package java_library_handle_dangerous_statements_case4;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException
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
		
		while(true)
		{
			
		
		try
		{
			System.out.println(a1[index]);//dangerous statement
			break;
		}
		catch(ArrayIndexOutOfBoundsException orv)
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
			
//			 System.out.println(a1[index]);
		}
		}
		
	}

}
