package com.allianz.assesment.exception;

import org.springframework.http.HttpStatus;

public class ExceptionResponse {

	
	public ExceptionResponse(String errorDescription, String errorCode) {
		super();
		this.errorDescription = errorDescription;
		this.errorCode = errorCode;
	}
	private String errorDescription;
	private String errorCode;
	public String getErrorDescription() {
		return errorDescription;
	}
	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	
}
