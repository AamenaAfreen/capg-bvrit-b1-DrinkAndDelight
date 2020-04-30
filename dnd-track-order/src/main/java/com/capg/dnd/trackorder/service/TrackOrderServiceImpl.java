package com.capg.dnd.trackorder.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.dnd.trackorder.model.RawMaterial;
import com.capg.dnd.trackorder.repo.ITrackOrderRepo;
@Service
public class TrackOrderServiceImpl implements ITrackOrderService{
	@Autowired
	ITrackOrderRepo repo;
	
	@Override
	public RawMaterial insertRawMaterials(RawMaterial rm) {
		return repo.insertRawMaterials(rm);
	}
	
	@Override
	public RawMaterial getRawMaterials(int id) {
		return repo.getRawMaterials(id);
	}

}