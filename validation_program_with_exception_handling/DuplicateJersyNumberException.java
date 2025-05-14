package validation_program_with_exception_handling;

public class DuplicateJersyNumberException extends JerseyException
{
	
	@Override
	public String toString()
	{
		return "given jersey number is not unique";
	}
}
