package project.hrms.core.utilities;

public class ErrorDataResult<T> extends DataResult<T>{

	public ErrorDataResult(T data, boolean success) 
	{
		super(data, success);
	}
	
	public ErrorDataResult(T data) 
	{
		super(data, true);
	}

	public ErrorDataResult(String message) 
	{
		super(null, false, message);
	}
	public ErrorDataResult() 
	{
		super(null, false);
	}
	

}
