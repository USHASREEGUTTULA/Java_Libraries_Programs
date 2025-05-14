package java_libarary_object_class_programs_customized_op;

public class CarMainClass 
{
	public static void main(String[] args) 
	{
		Car car1=new Car("Tata","AP24 UC 5641","Black",20);
		Car car2=new Car("BMW","TS 35 AA 1111","Red",42);
		Car car3=new Car("Audi","AP23 UN 2103","White",53);
		
		//-----------------------------------------------------------------------------------------
		//toString method
		
		//storing the result in a variable and thn printing
		String car1usefulinfo=car1.toString();
		String car2usefulinfo=car2.toString();
		String car3usefulinfo=car3.toString();
		
			System.out.println(car1.getBrand()+" Useful Information is "+car1usefulinfo);
			System.out.println(car2.getBrand()+" Useful Information is "+car2usefulinfo);
			System.out.println(car3.getBrand()+" Useful Information is "+car3usefulinfo);
		
		//Another way-directly printing the result
			
			System.out.println(car1.getBrand()+" Useful Information is "+car1.toString());
			System.out.println(car2.getBrand()+" Useful Information is "+car2.toString());
			System.out.println(car3.getBrand()+" Useful Information is "+car3.toString());
		
		//Implicit call to toString() only works when u r printing the object refrence variable
			
			System.out.println(car1.getBrand()+" Useful Information is "+car1);
			System.out.println(car2.getBrand()+" Useful Information is "+car2);
			System.out.println(car3.getBrand()+" Useful Information is "+car3);
			
		//-----------------------------------------------------------------------------------------
			
		//equals method
			
			//Comparing the objects and printing the statements accordingly
			if(car3.equals(car2))
			{
				System.out.println("Both "+car3.getBrand()+" and "+ car2.getBrand()+" have same mileage");
			}
			else
			{
				System.out.println("Both "+car3.getBrand()+" and "+ car2.getBrand()+" have diff mileage");
			}
		
			//Another way-directly printing the result
			
			System.out.println(car3.equals(car2));
		//---------------------------------------------------------------------------------------
			
		//hashcode method
			
			//storing the result in a variable and thn printing
			int car1UN=car1.hashCode();
			int car2UN=car2.hashCode();
			int car3UN=car2.hashCode();
			
			System.out.println("Unquie and Universeal Identifaction of "+car1.getBrand()+" is "+car1UN);
			System.out.println("Unquie and Universeal Identifaction of "+car2.getBrand()+" is "+car2UN);
			System.out.println("Unquie and Universeal Identifaction of "+car3.getBrand()+" is "+car3UN);
			
			
			//Another way-directly printing the result

			System.out.println("Unquie and Universeal Identifaction of "+car1.getBrand()+" is "+car1.hashCode());
			System.out.println("Unquie and Universeal Identifaction of "+car2.getBrand()+" is "+car2.hashCode());
			System.out.println("Unquie and Universeal Identifaction of "+car3.getBrand()+" is "+car3.hashCode());
			
		//-----------------------------------------------------------------------------------------
			
			
				
	}

}
