package dnd.updateproductstock.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import dnd.updateproductstock.model.ProductStock;

public interface IproductStockRepo  extends JpaRepository<ProductStock,Long> {

}
