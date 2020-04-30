package dnd.display.supplier.details.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import dnd.display.supplier.details.model.SupplierEntity;

public interface SupplierDAO extends JpaRepository<SupplierEntity,Long>{

}
