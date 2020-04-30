package com.capg.dnd.trackorder.service;

import com.capg.dnd.trackorder.model.RawMaterial;

public interface ITrackOrderService {
	public RawMaterial insertRawMaterials(RawMaterial rm);
	public RawMaterial getRawMaterials(int id);
	
}

