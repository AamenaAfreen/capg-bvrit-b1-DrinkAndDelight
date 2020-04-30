package com.capg.dnd.trackorder.repo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capg.dnd.trackorder.model.RawMaterial;

@Repository
@Transactional
public class TrackOrderRepoImpl implements ITrackOrderRepo{
	@PersistenceContext
	EntityManager em;
	
	@Override
	public RawMaterial insertRawMaterials(RawMaterial rm) {
		
		 em.persist(rm);
		 
		 return rm;
		 
	}
	
	@Override
	public RawMaterial getRawMaterials(int id) {
		
		return em.find(RawMaterial.class, id);
	}
	
}