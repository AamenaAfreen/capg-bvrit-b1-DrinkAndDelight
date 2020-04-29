package dnd.display.supplier.details.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import dnd.display.supplier.details.exceptions.SupplierWithIdNotFoundException;

@ControllerAdvice
@RestController
public class SupplierErrorController {

	@ExceptionHandler(SupplierWithIdNotFoundException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Supplier with this id is Not Found" , code = HttpStatus.NOT_FOUND)
	public void SupplierWithIdNotFoundException() {
		
	}
	
}
