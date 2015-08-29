package com.fhqinui.frize.common.exception;

public class PatternException extends RuntimeException{

	private static final long serialVersionUID = 2125579671789785641L;
	
	private String errorCode;
	
	public PatternException(String errorCode, String msg) {
		super(msg);
		setErrorCode(errorCode);
    }
	
	public PatternException(String msg) {
		super(msg);
    }
	
    /**
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

}
