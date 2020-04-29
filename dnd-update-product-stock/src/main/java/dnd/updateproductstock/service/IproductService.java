package dnd.updateproductstock.service;

import java.util.Date;

import dnd.updateproductstock.model.ProductStock;

public interface IproductService {
	String updateExitDate(String orderId);
	String updateProductStockDetails(String orderId);
	String trackProductOrder(String orderId);

}
   