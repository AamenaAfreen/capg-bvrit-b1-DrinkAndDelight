package dnd.display.supplier.details.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dnd.display.supplier.details.DAO.SupplierDAO;
import dnd.display.supplier.details.exceptions.SupplierWithIdNotFoundException;
import dnd.display.supplier.details.model.SupplierEntity;

@Service
public class SupplierServiceImpl implements SupplierService {

	@Autowired
	SupplierDAO repo;

	public SupplierEntity addSupplierDetails(SupplierEntity details) {
		return repo.save(details);
	}

	public boolean deleteSupplierDetails(Long supplierId) {
		repo.deleteById(supplierId);
		return (!repo.existsById(supplierId));
	}

	public SupplierEntity getSupplierDetailsById(Long supplierId) {
		if(!repo.existsById(supplierId)) {
		throw new SupplierWithIdNotFoundException("Supplier with Id : ["+supplierId+"] Not Found");
	}
		return repo.getOne(supplierId);
	}

	public List<SupplierEntity> getAllSupplierDetails() {	
		return repo.findAll();
	}

	public SupplierEntity updateSupplierDetails(SupplierEntity newdetails) {
		SupplierEntity olddetails = repo.getOne(newdetails.getSupplierId());
		olddetails.setName(newdetails.getName());
		olddetails.setAddress(newdetails.getAddress());
		olddetails.setphoneNo(newdetails.getphoneNo());
		return olddetails;
	}
	
}
