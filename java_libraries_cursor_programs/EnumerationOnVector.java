package java_libraries_cursor_programs;

import java.util.Enumeration;

import java.util.Vector;

public class EnumerationOnVector 
{
	public static void main(String[] args) 
	{
		Vector<Integer> a1=new Vector<Integer>();
		
		a1.add(12);
		a1.add(34);
		a1.add(56);
		a1.add(98);
		a1.add(62);
		
		Enumeration<Integer> i1=a1.elements();
	
		while(i1.hasMoreElements())
		{
			System.out.println(i1.nextElement());
		}
		
		
	}

}
