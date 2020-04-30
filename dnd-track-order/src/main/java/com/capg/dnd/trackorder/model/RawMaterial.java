
package com.capg.dnd.trackorder.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="RawMaterials")
public class RawMaterial {
 
	@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE)
	int orderId;
	String name;
	double quantityValue;
	String quantityUnit;
	@DateTimeFormat(pattern="yyyy/MM/dd")
	Date dateOfOrder;
	Date dateOfDelivery;
	Date manufacturingDate;
	Date processingDate;
	double pricePerUnit;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getQuantityValue() {
		return quantityValue;
	}
	public void setQuantityValue(double quantityValue) {
		this.quantityValue = quantityValue;
	}
	public String getQuantityUnit() {
		return quantityUnit;
	}
	public void setQuantityUnit(String quantityUnit) {
		this.quantityUnit = quantityUnit;
	}
	public Date getDateOfOrder() {
		return dateOfOrder;
	}
	public void setDateOfOrder(Date dateOfOrder) {
		this.dateOfOrder = dateOfOrder;
	}
	public Date getDateOfDelivery() {
		return dateOfDelivery;
	}
	public void setDateOfDelivery(Date dateOfDelivery) {
		this.dateOfDelivery = dateOfDelivery;
	}
	public Date getManufacturingDate() {
		return manufacturingDate;
	}
	public void setManufacturingDate(Date manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}
	public Date getProcessingDate() {
		return processingDate;
	}
	public void setProcessingDate(Date processingDate) {
		this.processingDate = processingDate;
	}
	public double getPricePerUnit() {
		return pricePerUnit;
	}
	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getWareouseId() {
		return wareouseId;
	}
	public void setWareouseId(String wareouseId) {
		this.wareouseId = wareouseId;
	}
	double totalPrice;
	String wareouseId;
	public RawMaterial() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RawMaterial(int orderId, String name, double quantityValue, String quantityUnit, Date dateOfOrder,
			Date dateOfDelivery, Date manufacturingDate, Date processingDate, double pricePerUnit, double totalPrice,
			String wareouseId) {
		super();
		this.orderId = orderId;
		this.name = name;
		this.quantityValue = quantityValue;
		this.quantityUnit = quantityUnit;
		this.dateOfOrder = dateOfOrder;
		this.dateOfDelivery = dateOfDelivery;
		this.manufacturingDate = manufacturingDate;
		this.processingDate = processingDate;
		this.pricePerUnit = pricePerUnit;
		this.totalPrice = totalPrice;
		this.wareouseId = wareouseId;
	}
	@Override
	public String toString() {
		return "RawMaterial [orderId=" + orderId + ", name=" + name + ", quantityValue=" + quantityValue
				+ ", quantityUnit=" + quantityUnit + ", dateOfOrder=" + dateOfOrder + ", dateOfDelivery="
				+ dateOfDelivery + ", manufacturingDate=" + manufacturingDate + ", processingDate=" + processingDate
				+ ", pricePerUnit=" + pricePerUnit + ", totalPrice=" + totalPrice + ", wareouseId=" + wareouseId + "]";
	}
}
 
	