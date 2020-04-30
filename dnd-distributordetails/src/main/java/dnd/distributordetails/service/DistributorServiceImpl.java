package dnd.distributordetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dnd.distributordetails.Repo.DistributorRepo;
import dnd.distributordetails.model.DistributorEntity;

@Service
public class DistributorServiceImpl implements DistributorService{

	@Autowired
	DistributorRepo repo;

	public DistributorEntity addDistributorDetails1(DistributorEntity details) {
		return repo.save(details);
	}

	public boolean deleteDistributorDetails1(int distributorId) {
		repo.deleteById(distributorId);
		return (!repo.existsById(distributorId));
	}
	
	

	public DistributorEntity getDistributorDetails1(int distributorId) {
		return repo.getOne(distributorId);
	}

	public List<DistributorEntity> getAllDistributorDetails() {	
		return repo.findAll();
	}

	@Override
	public DistributorEntity addDistributorDetails(DistributorEntity details) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteDistributorDetails(int distributorId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public DistributorEntity getDistributorDetails(int distributorId) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
