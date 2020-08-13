package dnd.display.supplier.details.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dnd.display.supplier.details.model.SupplierEntity;
//import dnd.display.supplier.details.service.SupplierServiceImpl;

@RestController
@RequestMapping("/supplier")
public class SupplierController {
	
	@Autowired
	SupplierServiceImpl service;
	
	@GetMapping("/a")
	public String getMessage() {
		return "Welcome";
	}
	
	@PostMapping("/add")
	public SupplierEntity addSupplierDetails(@RequestBody SupplierEntity details) {
		return service.addSupplierDetails(details);
	}
	
	@DeleteMapping("/delete/{supplierId}")
	public boolean deleteSupplierDetails(@PathVariable("supplierId") Long supplierId) {
		return service.deleteSupplierDetails(supplierId);
	}
	
	@GetMapping("/id/{supplierId}")
	public ResponseEntity<SupplierEntity> getSupplierDetailsById(@PathVariable("supplierId") Long supplierId) {
		SupplierEntity info = service.getSupplierDetailsById(supplierId);
		return new ResponseEntity<SupplierEntity>(info,HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public List<SupplierEntity> getAllSupplierDetails(){
		return service.getAllSupplierDetails();
	}
	
	@PutMapping("/update/{id}")
	public SupplierEntity updateSupplierDetails(@RequestBody SupplierEntity details) {
		return service.updateSupplierDetails(details);
	}

	@GetMapping("/RMdetails/{supplierId}")
	public SupplierEntity fetchRawMaterialDetails(Long supplierId, String deliveryStatus) {
		return null;
	}
}
