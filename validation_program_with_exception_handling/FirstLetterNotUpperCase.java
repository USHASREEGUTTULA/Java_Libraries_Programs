package validation_program_with_exception_handling;

public class FirstLetterNotUpperCase extends RuntimeException{
	@Override
	public String toString()
	{
		return "first letter is not in uppercase";
	}
}
