package validation_program_with_exception_handling;

public class JerseyNumberException extends JerseyException {
	@Override
	public String toString()
	{
		return "jersey number is not in the given range";
	}
}


