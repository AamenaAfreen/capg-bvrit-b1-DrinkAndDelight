package dnd.display.supplier.details.service;

import java.util.List;

import dnd.display.supplier.details.model.SupplierEntity;

public interface SupplierService{

    public SupplierEntity addSupplierDetails(SupplierEntity details);
	public boolean deleteSupplierDetails(Long supplierId);
	public SupplierEntity getSupplierDetailsById(Long supplierId);
	public List<SupplierEntity> getAllSupplierDetails();
	
}
