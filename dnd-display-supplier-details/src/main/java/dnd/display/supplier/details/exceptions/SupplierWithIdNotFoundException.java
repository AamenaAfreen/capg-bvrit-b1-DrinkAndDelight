package dnd.display.supplier.details.exceptions;

@SuppressWarnings("serial")
public class SupplierWithIdNotFoundException extends RuntimeException{
	
	public SupplierWithIdNotFoundException(String msg) {
		super(msg);
	}

}
