	package java_libraries_cursor_programs;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorOnLists
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		
		a1.add(12);
		a1.add(34);
		a1.add(56);
		a1.add(98);
		a1.add(62);
		
		ListIterator<Integer> i1=a1.listIterator();
	
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		
	}
}
