package java_libarary_object_class_programs_customized_op;

/*
4.create a main class with main method 
5.create box array (non-primitive array) with size 4 and store 4 box objects in an array
6.create a for loop to print useful and basic information of each and every box
7.compare 2nd box with 4 th box
8.create a for loop to print hash code number of each and every box	
*/
public class BoxMainClass
{
	public static void main(String[] args) 
	{
		// Creating array of 4 Box objects
        Box[] boxes = new Box[4];
        
        //2 boxes for 2d
        boxes[0] = new Box(3, 4);
        boxes[1] = new Box(5, 6);
        //2 boxes for 3d
        boxes[2] = new Box(2, 3, 4);
        boxes[3] = new Box(4, 5, 6);
		
        //------------------------------------
        //to String method
        for(int i=0;i<=boxes.length-1;i++)
        {
        	String boxesUI=boxes[i].toString();
        	System.out.println(boxesUI);
        	
        }
        
        //-------------------------------------
        //equals method
        // Compare 2nd and 4th box
        if(boxes[1].equals(boxes[3]))
        {
        	System.out.println(" Box 2 and Box 4 have same dimensions");

        }
        else
        {
        	System.out.println(" Box 2 and Box 4 have different dimensions");
        }
        
        //-------------------------------------------
        //hashcode method
        for(int i=0;i<=boxes.length-1;i++)
        {
        	int boxesUN=boxes[i].hashCode();
        	System.out.println(boxesUN);
        	
        }
        
	}
}
