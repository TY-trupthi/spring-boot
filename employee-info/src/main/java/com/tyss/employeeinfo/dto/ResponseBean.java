package com.tyss.employeeinfo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ResponseBean {

	private Object Data;
	private String message;
	private boolean error;
	public ResponseBean(Object data, String message, boolean error) {
		super();
		Data = data;
		this.message = message;
		this.error = error;	
	}
	public Object getData() {
		return Data;
	}
	public void setData(Object data) {
		Data = data;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isError() {
		return error;
	}
	public void setError(boolean error) {
		this.error = error;
	}


}
