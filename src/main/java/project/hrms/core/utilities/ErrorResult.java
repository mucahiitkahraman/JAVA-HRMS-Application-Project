package project.hrms.core.utilities;

public class ErrorResult extends Result {

	public ErrorResult(boolean success) 
	{
		super(success);
	}
	
	public ErrorResult(String message) 
	{
		super(false, message);
	}
	
}
