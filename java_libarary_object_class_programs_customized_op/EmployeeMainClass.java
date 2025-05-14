package java_libarary_object_class_programs_customized_op;

public class EmployeeMainClass
{
	public static void main(String[] args) 
	{
		//-----------------------------------------------------------------------------------------
		//toString method
		
		Employee employee1=new Employee("EMP123","Kiran","Hr",25000.0,3.5);
		
		String employee1UsefulInfo =employee1.toString();
		
		System.out.println(employee1UsefulInfo);
		
		Employee employee2=new Employee("EMP173","Usha","Developer",25000.0,2.5);
		
		String employee2UsefulInfo =employee2.toString();
		
		System.out.println(employee2UsefulInfo);
		
		//-----------------------------------------------------------------------------------------
		//equals method
		
		//Getters and setters methods are used here
		if(employee1.equals(employee2))
		{
			System.out.println("Both "+employee1.getName()+" and "+ employee2.getName()+" have same yoe");
		}
		else
		{
			System.out.println("Both "+employee1.getName()+" and "+ employee2.getName()+" have diff yoe");
		}
		
		//---------------------------------------------------------------------------------------
		
		//hashcode method
		
		int employee1UN=employee1.hashCode();
		int employee2UN=employee2.hashCode();
		
		//by using some algorithm ,we got an unquie numbers for student 1 and student 2
		System.out.println(employee1UN);
		System.out.println(employee2UN);
		
		//-----------------------------------------------------------------------------------------
		
		
	}
	

}
