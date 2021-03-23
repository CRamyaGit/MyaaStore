package fr.perso.mya.data.dao;


import java.util.List;

import fr.perso.mya.data.entity.SalesUnit;


public interface ISalesUnitDao {
	
	SalesUnit findOne(Long idUnite);
	SalesUnit createOne(SalesUnit salesUnit);
	List<SalesUnit> findAll();
	
}
