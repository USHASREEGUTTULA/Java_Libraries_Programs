package validation_program_with_exception_handling;

public class RunnerValidation 
{
	public static boolean runnerNameValidation(String name)
	{
		if(check2Words(name) && checkAlphabets(name) && capital(name))
			return true;
		else
			return false;
	}
	public static boolean check2Words(String name)
	{
		String s1[]=name.split(" ");
		if(s1.length==2)
			return true;
		else
			throw new Min2WordsPresentException();
	}
	public static boolean checkAlphabets(String name)
	{
		String s1[]=name.split(" ");
		boolean res1=count(s1[0]);
		boolean res2=count(s1[1]);
		if(res1 && res2)
			return true;
		else
			throw new AlphabetsChackException();
	}
	public static boolean count(String word)
	{
		int c=0;
		for(int i=0;i<=word.length()-1;i++)
		{
			char ch=word.charAt(i);
			if(Character.isAlphabetic(ch))
				c++;
		}
		if(c==word.length())
			return true;
		else
			return false;
	}
	public static boolean capital(String name)
	{
		String s1[]=name.split(" ");
		char ch1=s1[0].charAt(0);
		char ch2=s1[1].charAt(0);
		if((ch1>=65 && ch1<=90) && (ch2>=65 && ch2<=90))
			return true;
		else
			throw new FirstLetterNotUpperCase();
	}
	public static boolean jerscy(int num,int[] allJersyNumber) throws JerseyException
	{
		if(num>=10 && num<=500)
		{
			boolean isunique=true;
			for(int i=0;i<=allJersyNumber.length-1;i++)
			{
				if(num==allJersyNumber[i])
				{
					isunique=false;
					break;
				}
			}
			
			if(isunique)
				return true;
			else
				throw new DuplicateJersyNumberException();
		}
		else
			throw new JerseyNumberException();
	}
	public static boolean avgSpeed(double speed) throws AverageSpeedException
	{
		if(speed>=5.0 && speed<=12.0)
		{
			return true;
		}
		else
			throw new AverageSpeedException();
	}
	
}


