package validation_program_with_exception_handling;
public class Runner 
{
	private String name;
	private int jerscy;
	private double avg;
	public static int distance=40;
	public static int[] allJersyNumber=new int[500];
	public int index=0;
	
	public Runner(String name,int number,double avg) throws AverageSpeedException,JerseyException
	{
		if(RunnerValidation.runnerNameValidation(name) && RunnerValidation.jerscy(number,allJersyNumber) && RunnerValidation.avgSpeed(avg))
		{
			this.name=name;
			this.jerscy=number;
			allJersyNumber[index]=number;
			index++;
			this.avg=avg;
		}
		else
		{
			System.err.println("invalid information");
		}
	}
	public double time()
	{
		double time= distance/avg;
		return time;
	}
	public double hoursToSeconds()
	{
		double seconds=time()*60*60;
		return seconds;
	}
	public String toString()
	{
		return name+" : "+jerscy;
	}
	public boolean equals(Object obj)
	{
		Runner getRunner=(Runner)obj;
		boolean res=this.avg==getRunner.avg;
		return res;
	}
}

