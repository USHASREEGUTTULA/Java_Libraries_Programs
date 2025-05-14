package java_libarary_object_class_programs_customized_op;

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
			/*	if u press ctrl space u will get methods which u can override by this way no need to 
		Remember all 11 methods declaration of object class	*/
		//-----------------------------------------------------------------------------------------
		@Override
		public  String toString()
		{
			/*u can directly return this statement or store it in a variable and return that variable
			 
			String ui="This is "+name+" working as a "+designation+" from past "+yearsofexp+" years";
			return ui;
			
			where ui is useful information*/
			
			//no need to use this.name in return statement ,because in toString(),we dont have local var name 
			return "This is "+name+" working as a "+designation+" from past "+yearsofexp+" years";
			
		}
		//-----------------------------------------------------------------------------------------
		@Override
		public boolean equals(Object obj)
		{
			//Downcasting
			Employee givenEmp=(Employee)obj;
			//compare this object with given emp object
			boolean cr=this.yearsofexp==givenEmp.yearsofexp;
			//return the cr
			return cr;
		}
		//--------------------------------------------------------------------------------------------
		@Override
		public int hashCode() 
		{
			//concat both methods numbers into a final number and return it
			int finalHashCodeNumber=prodOfASCII()*firstEvenDigitInSalary(salary);
			return finalHashCodeNumber;
			
		}
       
		//Hashcode alogrithm
		/*Convert years of experience into String,find product of ascii value of only digits,
		multiply with salary's digit which is first occurence even number*/
		
		public int prodOfASCII()
		{
			int prodOfASCII=0;
			//convert double to String
			String yoe=""+yearsofexp;
			
			for(int i=0;i<=yoe.length()-1;i++)
			{
				//extract the char
				char ch=yoe.charAt(i);
				//convert char to ascii
				int ascii=(int)ch;
				//prod of ascii only for the digits
				if(ch>='0'&& ch<='9') 
				{
					prodOfASCII=prodOfASCII+ascii;
				}	
				
			}
			return prodOfASCII;
			
		}
		
		public int firstEvenDigitInSalary(double salary)
		{
			 while (salary > 0) 
			 {
		            int digit = (int) (salary % 10); // Extract last digit
		           
		            if (digit % 2 == 0) 
		            {  // Check if digit is even
		                return digit; // Return the first even digit found
		            }
		            salary /= 10; // Remove last digit
		        }
			 
		        return -1; // Return -1 if no even digit is found
		    }
			
		
		//-----------------------------------------------------------------------
		//Getters and Setters
		
		public String getId() {
			return id;
		}
		//No need of setters for id
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public double getYearsofexp() {
			return yearsofexp;
		}
		public void setYearsofexp(double yearsofexp) {
			this.yearsofexp = yearsofexp;
		}
		
		
	}



