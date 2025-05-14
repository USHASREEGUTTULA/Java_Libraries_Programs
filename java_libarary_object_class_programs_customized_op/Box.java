package java_libarary_object_class_programs_customized_op;

/*
 wap for below requirement
1. program for box
2. box characteristics are length ,width,height,area
3.perform below operations
	a.create a constructor to initialize 2 dimensional box(l,w)
	b.create a constructor to initialize 3 dimension box(l,w,h)
	c.avoid code repition among constructors (use this call)
	d.create a separate functionality to calculate area
	e.return only area as a useful information
	f.compare boxes based on their dimensions for 2d and 3d separately
	g.find the factorial of area and multiply with sum of dimensions
	
NOTE:-If sum of dimension is a prime number ,consider the same number for multiplication ,
otherwise generate sum of dimensions next immediate prime digit.

	h.return this as hashcode number

4.create a main class with main method 
5.create box array (non-primitive array) with size 4 and store 4 box objects in an array
6.create a for loop to print useful and basic information of each and every box
7.compare 2nd box with 4 th box
8.create a for loop to print hash code number of each and every box	
	
*/

public class Box 
{
	
	private int length;
	private int width;
	private int height;
	private int area;
	
	//2D Box
	public Box(int length, int width) 
	{
		this.length = length;
		this.width = width;
	}

	//3D Box
	public Box(int length, int width, int height)
	{
		//use this call to reduce code repeatability
		this(length,width);
		this.height = height;
	}
	
	//Calculate area
	public double getArea()
	{
		if(height==0)
		{
			//Area for 2D box(no height will be there for 2D box)
			 area=length*width;
		}
		else
		{
			//Area for 3D box
			 area=(2 * (length * width + width * height + height * length));
		}
	return area;
	}
	
	//to string method
	@Override
	public String toString() 
	{
		return "Area of the Box is "+getArea();
		
	}
	
	//equals method
	@Override
	public boolean equals(Object obj) 
	{
		//Downcasting
		Box givenBox=(Box)obj;
		
		if (this.height == 0 && givenBox.height == 0) 
		{
            // Comparing only length and width for 2D boxes
           boolean cr= this.length == givenBox.length && this.width == givenBox.width;
           return cr;
        } 
		else
		{
            // Comparing length, width, and height for 3D boxes
            boolean cr= this.length == givenBox.length && this.width == givenBox.width && this.height == givenBox.height;
            return cr;
        }
		
	}
	
	//hashcode method
	@Override
	public int hashCode() 
	{
		int sumOfDimensions = length + width + height;
		
		int primeNumber;
		//check if we want to take prime or next prime
        if (isPrime(sumOfDimensions))
        {
        	primeNumber = sumOfDimensions;
        } 
        else 
        {
        	primeNumber = nextPrime(sumOfDimensions);
        }
        
        int finalHashCodeNumber=getFactorial() * primeNumber;
        
        return finalHashCodeNumber;
	}
		
	//Factorial of area
	public int getFactorial()
	{
		int product=1;
		for(int i=1;i<=area;i++)
		{
			product=product*i;
		}
		return product;
	}
	
	// to check if a number is prime
    private boolean isPrime(int num)
    {
    	if(num<2)
    	{
    		return false;
    	}
        for (int i = 2; i < num; i++) 
        {
            if (num % i == 0) 
            	{
            	return false;
            	}
        }
        return true;
    }

    // Method to get next prime number
    private int nextPrime(int num) 
    {
        while (!isPrime(num))
        {
        	//when it is not prime then we have to go to next immediate prime digit
            num++;
        }
        return num;
    }

    //Getters and Setters
    
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
    


}
