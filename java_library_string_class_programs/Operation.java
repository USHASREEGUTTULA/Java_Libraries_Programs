package java_library_string_class_programs;

public class Operation 
{
	public static void main(String[] args)
	{
		//Without scanner class can we take inputs,yes!
		int i=Integer.parseInt(args[0]);
		int j=Integer.parseInt(args[1]);
		
		char k=args[2].charAt(0);
		
		
		sum(i,j);
		check(k);
	}
		public static void sum(int a,int b)
		{
			System.out.println("Sum of 2 numbers :"+(a+b));
		}
		
		public static void check(char ch)
		{
			if(Character.isAlphabetic(ch))
			{
				System.out.println("Yes...."+ch+" is an alphabet");
			}
			else
			{
				System.out.println("No...."+ch+" is not an alphabet");
			}
			
		}
		
	

}
