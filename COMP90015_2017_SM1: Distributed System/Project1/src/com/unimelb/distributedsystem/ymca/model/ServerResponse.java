package com.unimelb.distributedsystem.ymca.model;

public class ServerResponse
{
	private String	response;
	private String	errorMessage;

	public ServerResponse()
	{
		response = "success";
	}

	public ServerResponse(Throwable throwable)
	{
		this.response = "error";
		this.errorMessage = throwable.getMessage();
	}

	public ServerResponse(String errorMessage)
	{
		this.response = "error";
		this.errorMessage = errorMessage;
	}

	public String getResponse()
	{
		return response;
	}

	public String getErrorMessage()
	{
		return errorMessage;
	}
}
