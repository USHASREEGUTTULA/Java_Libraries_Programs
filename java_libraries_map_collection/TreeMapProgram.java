package java_libraries_map_collection;

import java.util.TreeMap;

public class TreeMapProgram 
{

	public static void main(String[] args) 
	{
		TreeMap<Integer,String> a1=new TreeMap<Integer,String>();
		
		a1.put(12,"Hii");
		a1.put(34,"hlo");
		a1.put(56,"good");
		a1.put(98,"morning");
		a1.put(62,"usha");
		
		System.out.println(a1);
		System.out.println(a1.get(56));
		System.out.println(a1.keySet());
		System.out.println(a1.values());
		
	}

}
