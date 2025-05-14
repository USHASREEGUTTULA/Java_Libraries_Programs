package validation_program_with_exception_handling;

public class Min2WordsPresentException extends RuntimeException {

	@Override
	public String toString()
	{
		return "String does not contain min 2 words";
	}

}
