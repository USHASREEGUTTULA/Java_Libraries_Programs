package java_libarary_object_class_programs_customized_op;

public class Car 
{
	private String brand;
	private String regno;
	private String color;
	private int mileage;
	
	public Car(String brand,String regno,String color,int mileage)
	{
		this.brand=brand;
		this.regno=regno;
		this.color=color;
		this.mileage=mileage;
	}
	
	//to String method
	@Override
	public String toString() 
	{
		return this.brand+" "+this.color;
	}
	
	//equals method
	@Override
	public boolean equals(Object obj) 
	{
		//Downcasting
		Car givencar=(Car)obj;
		//compare this object with given emp object
		boolean cr=this.mileage==givencar.mileage;
		//return the cr
		return cr;
		
	}

	//getters and setters
	public String getBrand() {
		return brand;
	}
	
	public String getRegno() {
		return regno;
	}

	public void setRegno(String regno) {
		this.regno = regno;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	//hashcode method
	@Override
	public int hashCode() 
	{
		//concat both methods numbers into a final number and return it
		int finalHashCodeNumber=sumOfASCII()*sumOfDigit();
		return finalHashCodeNumber;
		
	}
	
	/*
	 XX YY ZZ AA A A
	 0123456789101112
	 For alphabets take these two substrings and concat these two strings and for that joined string do sum of ascii values
	 
	 String XX=substring(0,2);
	 String ZZ=substring(6,8);
	 String joinedString=XX+YY;
	 
	 int sumOfASCII=0;
		
		for(int i=0;i<=joinedString.length()-1;i++)
		{
		sumOfASCII=(int)sumOfASCII+charAt(i);
		}
		return sumOfASCII;	
	 
	 */
	public int sumOfASCII()
	{
		int sumOfASCII=0;
		
		for(int i=0;i<=regno.length()-1;i++)
		{
			//extract the char
			char ch=regno.charAt(i);
			
			if(ch>='A'&& ch<='Z')
			{
				//convert char to ascii
				int ascii=(int)ch;
				
				sumOfASCII=sumOfASCII+ascii;
			}	
					
		}
		return sumOfASCII;
		
	}
	
	public int sumOfDigit()
	{
		int sumOfDigit=0;
		
		for(int i=0;i<=regno.length()-1;i++)
		{
			//extract the char
			char ch=regno.charAt(i);
			
			if(ch>='0'&& ch<='9') 
			{
				sumOfDigit=sumOfDigit+ch;
			}
			
		}
		return sumOfDigit;
		
	}
	
	
	

}
