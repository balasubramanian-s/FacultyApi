package com.revature.faculty.Exception;

public class ServiceException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public ServiceException(String serviceException)
	{
		super(serviceException);
	}

}
