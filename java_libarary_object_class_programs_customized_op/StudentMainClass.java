package java_libarary_object_class_programs_customized_op;

public class StudentMainClass 
{
	public static void main(String[] args) 
	{
		//-----------------------------------------------------------------------------------------
		//to String method
		Student student1=new Student("NIT125", "Usha", "BTech", 8.5);
		String student1usefulinfo = student1.getName().toString();
		System.out.println(student1usefulinfo);
		
		Student student2=new Student("NIT126", "Sam", "BTech", 8.3);
		String student2usefulinfo = student2.getName().toString();
		System.out.println(student2usefulinfo);
		//-----------------------------------------------------------------------------------------
		
		//equals method
		
		boolean customizedresult=student1.equals(student2);
		
		//System.out.println(customizedresult);
		
		if(customizedresult) 
		{
			System.out.println("Both "+student1.getName()+" and "+student2.getName()+" have same edu");
		}
		else
		{
			System.out.println("Both "+student1.getName()+" and "+student2.getName()+" have diff edu");
		}
		//-----------------------------------------------------------------------------------------
		
		//hashcode method
		
		int student1UN=student1.hashCode();
		int student2UN=student2.hashCode();
		
		//by using some algorithm ,we got an unquie numbers for student 1 and student 2
		System.out.println(student1UN);
		System.out.println(student2UN);
		
		//-----------------------------------------------------------------------------------------
		
	}

}
