package com.Login.constant;

public enum ResMessage {
	
	SUCCESS(200, "Success!!"),
	CANNOT_FIND_USERNAME_OR_PASSWORD(400,  "Cannot find username or password"),
	REGISTER_USER_NAME_DUPLICATE(400, "Register user name duplicate");
	
	
	private int code;
	
	private String message;
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	private ResMessage(int code, String message) {
		this.code = code;
		this.message = message;
	}
}
