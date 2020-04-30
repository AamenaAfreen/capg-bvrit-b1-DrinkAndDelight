package dnd.display.supplier.details.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SupplierEntity {

	@Id
	private Long supplierId;
	private String name;
	private String address;
	private Long phoneNo;
	
	public SupplierEntity(Long supplierId, String name, String address, long phoneNo) {
		super();
		this.supplierId = supplierId;
		this.name = name;
		this.address = address;
		this.phoneNo= phoneNo;
	}

	public SupplierEntity() {
		super();
	}

	public long getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getphoneNo() {
		return phoneNo;
	}

	public void setphoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "SupplierEntity [supplierId=" + supplierId + ", name=" + name + ", address=" + address + ", phoneNo="
				+ phoneNo + "]";
	}
	
	
}
