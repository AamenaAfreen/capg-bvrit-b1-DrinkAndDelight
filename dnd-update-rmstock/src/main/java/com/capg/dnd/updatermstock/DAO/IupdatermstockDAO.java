package com.capg.dnd.updatermstock.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.dnd.updatermstock.model.RawMaterialStock;

public interface IupdatermstockDAO extends JpaRepository<RawMaterialStock, String> {

}

