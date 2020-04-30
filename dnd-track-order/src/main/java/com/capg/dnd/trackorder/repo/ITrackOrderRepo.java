package com.capg.dnd.trackorder.repo;

import com.capg.dnd.trackorder.model.RawMaterial;

public interface ITrackOrderRepo {
	
	public RawMaterial insertRawMaterials(RawMaterial rm);
	public RawMaterial getRawMaterials(int id);
	
}