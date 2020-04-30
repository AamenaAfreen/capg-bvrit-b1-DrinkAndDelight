package com.capg.dnd.trackorder.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.ALREADY_REPORTED,reason = " RawMaterial Already Exist",value = HttpStatus.ALREADY_REPORTED)
public class RawMaterialAlreadyExistException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RawMaterialAlreadyExistException(String message)
	{
		super(message);
	}

}
