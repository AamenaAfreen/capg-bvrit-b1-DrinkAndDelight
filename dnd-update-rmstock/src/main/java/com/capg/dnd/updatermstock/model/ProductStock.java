package com.capg.dnd.updatermstock.model;

import java.util.Date;

public class ProductStock {

private String orderId;
private String name;
private double pricePerUnit;
private double quantityValue;
private String quantityUnit;
private double price;
private String warehouseID;
private Date deliveryDate;
private Date manufactuingDate;
private Date expiryDate;
private String qualityCheck;
private Date processDate;

public ProductStock(String orderId, String name, double pricePerUnit, double quantityValue, String quantityUnit,
double price, String warehouseID, Date deliveryDate, Date manufactuingDate, Date expiryDate,
String qualityCheck, Date processDate) {
super();
this.orderId = orderId;
this.name = name;
this.pricePerUnit = pricePerUnit;
this.quantityValue = quantityValue;
this.quantityUnit = quantityUnit;
this.price = price;
this.warehouseID = warehouseID;
this.deliveryDate = deliveryDate;
this.manufactuingDate = manufactuingDate;
this.expiryDate = expiryDate;
this.qualityCheck = qualityCheck;
this.processDate = processDate;
}

public String getOrderId() {
return orderId;
}

public void setOrderId(String orderId) {
this.orderId = orderId;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public double getPricePerUnit() {
return pricePerUnit;
}

public void setPricePerUnit(double pricePerUnit) {
this.pricePerUnit = pricePerUnit;
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

public double getPrice() {
return price;
}

public void setPrice(double price) {
this.price = price;
}

public String getWarehouseID() {
return warehouseID;
}

public void setWarehouseID(String warehouseID) {
this.warehouseID = warehouseID;
}

public Date getDeliveryDate() {
return deliveryDate;
}

public void setDeliveryDate(Date deliveryDate) {
this.deliveryDate = deliveryDate;
}

public Date getManufactuingDate() {
return manufactuingDate;
}

public void setManufactuingDate(Date manufactuingDate) {
this.manufactuingDate = manufactuingDate;
}

public Date getExpiryDate() {
return expiryDate;
}

public void setExpiryDate(Date expiryDate) {
this.expiryDate = expiryDate;
}

public String getQualityCheck() {
return qualityCheck;
}

public void setQualityCheck(String qualityCheck) {
this.qualityCheck = qualityCheck;
}

public Date getProcessDate() {
return processDate;
}

public void setProcessDate(Date processDate) {
this.processDate = processDate;
}

@Override
public String toString() {
return "ProductStock [orderId=" + orderId + ", name=" + name + ", pricePerUnit=" + pricePerUnit
+ ", quantityValue=" + quantityValue + ", quantityUnit=" + quantityUnit + ", price=" + price
+ ", warehouseID=" + warehouseID + ", deliveryDate=" + deliveryDate + ", manufactuingDate="
+ manufactuingDate + ", expiryDate=" + expiryDate + ", qualityCheck=" + qualityCheck + ", processDate="
+ processDate + "]";
}


}