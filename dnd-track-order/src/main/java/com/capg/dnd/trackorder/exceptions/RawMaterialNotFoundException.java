package com.capg.dnd.trackorder.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND,reason = "RawMaterial Not Found", value = HttpStatus.NOT_FOUND)
public class RawMaterialNotFoundException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RawMaterialNotFoundException(String message) 
	{
		
		super(message);
	}


}