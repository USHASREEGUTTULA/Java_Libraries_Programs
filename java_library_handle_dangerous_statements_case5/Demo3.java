package java_library_handle_dangerous_statements_case5;

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
			//giving 3 chances
			for(int j=3;j>=1;j--)
			{
				System.out.println(+j+" no of attempts left");
				index =sc.nextInt();// we are using the same b object instead of creating a new object
				
			}
			
			System.out.println("Your account is blocked by ethical hackers");
			break;
			
			
			
//			 System.out.println(a1[index]);
		}
		}
		
	}

}
