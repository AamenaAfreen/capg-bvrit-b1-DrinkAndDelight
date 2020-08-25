package dnd.distributordetails.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class DistributorEntity {

	@Id
	private int distributorId;
	private String name;
	private String address;
	private Long phoneNo;
	
	public DistributorEntity() {
		super();
	}

	public DistributorEntity(int distributorrId, String name, String address, Long phoneNo) {
		super();
		this.distributorId = distributorId;
		this.name = name;
		this.address = address;
		this.phoneNo = phoneNo;
	}

	public DistributorEntity(int distributorId, String name, String address) {
		super();
		this.distributorId = distributorId;
		this.name = name;
		this.address = address;
	}

	public int getDistributorId() {
		return distributorId;
	}

	public void setDistributorId(int distributorId) {
		this.distributorId = distributorId;
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

	public Long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "DistributorEntity [distributorId=" + distributorId + ", name=" + name + ", address=" + address + ", phoneNo="
				+ phoneNo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + distributorId;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DistributorEntity other = (DistributorEntity) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (distributorId != other.distributorId)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}
