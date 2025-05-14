package java_libarary_object_class_programs_customized_op;

public class Student 
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
	

	//Override the Object class methods 
	//-----------------------------------------------------------------------------------------
	@Override
	public  String toString()
	{
		//directly return the variables what ever u require as a useful information
		return education+" "+name;
		
	}
	//-----------------------------------------------------------------------------------------
	@Override
	public boolean equals(Object obj)
	//Object obj is super class object ,student 2 is sub class obj
	//but upcasted to superclass object obj so subclass properties will be hidden
	{
		//so our first step should be downcast the obj back to Student to make sub class properties visible
		Student givenstu=(Student)obj;
		//now we can compare this object(current object) with the given object and the result of this comparision 
		//will be boolean so store it boolean variable 
		boolean cr=this.education==givenstu.education;
		//return that boolean variable
		return cr;
		
	}
	//-----------------------------------------------------------------------------------------
	@Override
	public int hashCode() 
	{
		//concat both methods numbers into a final number and return it
		int finalHashCodeNumber=sumOfASCII()+extractNumberFromID();
		return finalHashCodeNumber;
		
	}
	
	public int sumOfASCII()
	{
		int sumOfASCII=0;
		for(int i=0;i<=name.length()-1;i++)
		{
			//extract the char
			char ch=name.charAt(i);
			//convert char to ascii
			int ascii=(int)ch;
			//sum of ascii
			sumOfASCII=sumOfASCII+ascii;
			
		}
		return sumOfASCII;
		
	}
	
	public int extractNumberFromID()
	{
		//empty string
		String extractNumberString="";
		//loop from 3 to 5 because 0,1,2 digits have alphabets
		for(int i=3;i<=5;i++)
		{
			char ch=id.charAt(i);
			
			//concat the last 3 chars to empty string ,so u get numbers in the form of string
			extractNumberString=extractNumberString+ch;
		}
		
		//convert that String number to int number
		
		int extractNumberInt=Integer.parseInt(extractNumberString);
		return extractNumberInt;
		
	}
	//----------------------------------------------
	//Getters and Setters
	public String getId() {
		return id;
	}

   //No need of setters for id ,because id cant be modified


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEducation() {
		return education;
	}


	public void setEducation(String education) {
		this.education = education;
	}


	public double getCgpa() {
		return cgpa;
	}


	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}


	//-----------------------------------------------------------------------------------------
	
	
}
