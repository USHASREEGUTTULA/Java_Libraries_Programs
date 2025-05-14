package java_libraries_queue_collection;

import java.util.PriorityQueue;

public class PriorityQueueProgram
{
	public static void main(String[] args) 
	{
		PriorityQueue<Integer> a1=new PriorityQueue<Integer>();
		
		a1.add(12);
		a1.add(3);
		a1.add(56);
		a1.add(2);
		a1.add(62);
		
		System.out.println(a1);
		System.out.println(a1.poll());
		System.out.println(a1);
		System.out.println(a1.poll());
		System.out.println(a1);
		System.out.println(a1.poll());
		System.out.println(a1);
		System.out.println(a1.poll());
		System.out.println(a1);
		
		
	}


}
