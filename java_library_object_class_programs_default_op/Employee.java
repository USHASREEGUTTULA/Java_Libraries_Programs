package java_library_object_class_programs_default_op;

public class Employee 
{
		private String id;
		private String name;
		private String designation;
		private double salary;
		private double yearsofexp;
		
		public Employee(String id,String name,String designation,double salary,double yearsofexp)
		{
			this.id=id;
			this.name=name;
			this.designation=designation;
			this.salary=salary;
			this.yearsofexp=yearsofexp;
		}
			
		
		public static void main(String[] args) 
		{
			//----------------------------------------------------------------------------
			
			//to String method
			Employee employee1=new Employee("EMP123","Kiran","Hr",25000.0,3.5);
			
			String employee1UsefulInfo =employee1.toString();
			System.out.println(employee1UsefulInfo);
			
			Employee employee2=new Employee("EMP173","Usha","Hr",25000.0,2.5);
			String employee2UsefulInfo =employee2.toString();
			System.out.println(employee2UsefulInfo);
			
			//----------------------------------------------------------------------------
			
			//equals method
			
			/*For equals method atleast we should have 2 objects are required*/
			boolean comparisionresult=employee1.equals(employee2);
			
			System.out.println(comparisionresult);
			//we are getting false because by default we are comparing the addresses of the object
			
			//----------------------------------------------------------------------------
			
			//hashcode method
			int unquienumber1=employee1.hashCode();
			int unquienumber2=employee2.hashCode();
			
			//by using some algorithm ,we got an unquie numbers for employee 1 and employee 2
			System.out.println(unquienumber1);
			System.out.println(unquienumber2);
		}
		
	}



