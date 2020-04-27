package dnd.updateproductstock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dnd.updateproductstock.repo.IproductStockRepo;
@Service
public class ProductStockServiceImpl implements IproductService {
	@Autowired
	IproductStockRepo repo;

	@Override
	public String updateExitDate(String orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateProductStockDetails(String orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String trackProductOrder(String orderId) {
		// TODO Auto-generated method stub
		return null;
	}

}
