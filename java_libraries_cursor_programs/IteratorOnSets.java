package java_libraries_cursor_programs;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorOnSets
{
	public static void main(String[] args) 
	{
		HashSet<Integer> a1=new HashSet<Integer>();
		
		a1.add(12);
		a1.add(34);
		a1.add(56);
		a1.add(98);
		a1.add(62);
		
		Iterator<Integer> i1=a1.iterator();
	
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		
	}

}
