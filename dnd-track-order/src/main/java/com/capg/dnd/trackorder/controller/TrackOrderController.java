


package com.capg.dnd.trackorder.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.dnd.trackorder.model.RawMaterial;
import com.capg.dnd.trackorder.service.TrackOrderServiceImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TrackOrderController {
	@Autowired
	TrackOrderServiceImpl tsi;

	@PostMapping("/rawmaterial/insert")
	
	public String insertRawMaterials(@RequestBody RawMaterial rm) {
		RawMaterial rawmaterial = tsi.insertRawMaterials(rm);
		return "Hello " + rawmaterial.getName() + rawmaterial.getPricePerUnit()
				+ rawmaterial.getQuantityUnit() + "\n Your Insertion is Successfull\n" + "Your Account Id is "
				+ rawmaterial.getOrderId();
	}

	
	@GetMapping(value = "/rawmaterial/getRawMaterials/{id}", produces = "application/text")
	public String getRawMaterials(@PathVariable int id) throws Exception {

		RawMaterial rawmaterial = tsi.getRawMaterials(id);

		if (rawmaterial == null) {
			throw new Exception("Invalid id");
		}
		return "Your Account details are " + rawmaterial.toString();
	}
	
	 
}