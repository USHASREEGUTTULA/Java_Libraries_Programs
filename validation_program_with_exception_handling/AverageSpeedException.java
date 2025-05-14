package validation_program_with_exception_handling;

public class AverageSpeedException extends Exception {

	@Override
	public String toString()
	{
		return "average speed is not in the given range";
	}

}
