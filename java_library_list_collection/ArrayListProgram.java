package java_library_list_collection;

import java.util.ArrayList;

public class ArrayListProgram 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		
		a1.add(12);
		a1.add(34);
		a1.add(56);
		a1.add(98);
		a1.add(62);
		a1.add(null);
		System.out.println(a1);
		
		System.out.println(a1.get(3));
		
		
	}

}
