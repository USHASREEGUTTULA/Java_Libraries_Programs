package java_library_object_class_programs_default_op;

class Student 
{
	private String id;
	private String name;
	private String education;
	private double cgpa;
	
	public Student(String id,String name,String education,double cgpa)
	{
		this.id=id;
		this.name=name;
		this.education=education;
		this.cgpa=cgpa;
	}


	public static void main(String[] args) 
	{
		//to String method
		Student student1=new Student("NIT125", "Usha", "BTech", 8.5);
		String student1usefulinfo = student1.toString();
		System.out.println(student1usefulinfo);
		
		Student student2=new Student("NIT126", "Sam", "BTech", 8.3);
		String student2usefulinfo = student2.toString();
		System.out.println(student2usefulinfo);
		
		//----------------------------------------------------------------------------
		
		//equals method 
		boolean comparisionresult=student1.equals(student2);
		System.out.println(comparisionresult);
		//we are getting false because by default we are comparing the addresses of the object
		
		//-----------------------------------------------------------------------------
		
		//hashcode method
		int unquienumber1=student1.hashCode();
		int unquienumber2=student2.hashCode();
		//by using some algorithm ,we got an unquie numbers for student 1 and student 2
		System.out.println(unquienumber1);
		System.out.println(unquienumber2);
		
		//------------------------------------------------------------------------------
		
	}
	
}
