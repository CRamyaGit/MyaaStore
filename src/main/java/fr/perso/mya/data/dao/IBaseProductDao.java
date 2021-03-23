package fr.perso.mya.data.dao;

import java.util.List;

import fr.perso.mya.data.entity.BaseProduct;

public interface IBaseProductDao {
	BaseProduct findOne(Long idUnite);
	BaseProduct createOne(BaseProduct baseProduct);
	List<BaseProduct> findAll();
	List<BaseProduct> findAllValid();
}
