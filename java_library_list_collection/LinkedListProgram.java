package java_library_list_collection;

import java.util.LinkedList;

public class LinkedListProgram 
{

	public static void main(String[] args) 
	{
		LinkedList<Integer> a1=new LinkedList<Integer>();
		
		a1.add(12);
		a1.add(34);
		a1.add(56);
		a1.add(98);
		a1.add(62);
		
		System.out.println(a1);
		
		Integer i1=a1.get(2);//boxing
		System.out.println(i1);
		
		int k=i1;//unboxing
		System.out.println(k);
		
		System.out.println(a1.get(3));
		
		
	}

}
