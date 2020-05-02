package dnd.updateproductstock.controller;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dnd.updateproductstock.model.ProductStock;
import dnd.updateproductstock.service.IproductService;


@RestController
@RequestMapping("/product")
public class ProductStockController {   
	@Autowired
	IproductService service;
	@GetMapping("/id/{orderId}")
	public String trackProductOrder(@PathVariable String orderId) {
		return service.trackProductOrder(orderId);
	}
	@PostMapping("/updateExitDate") 
	public String updateExitDate(@RequestBody String orderId) {
		return service.updateExitDate(orderId);
	}
	
	@PostMapping("/updateProductDetails")
	public String updateProductStockDetails(@RequestBody String orderId) {
		return service.updateProductStockDetails(orderId);
	}
}