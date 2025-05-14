package validation_program_with_exception_handling;

public class AlphabetsChackException extends RuntimeException 
{
	@Override
	public String toString()
	{
		return "some characters in String are does not having alphabets";
	}


}
