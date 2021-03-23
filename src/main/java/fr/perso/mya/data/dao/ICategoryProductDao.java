package fr.perso.mya.data.dao;

import java.util.List;

import fr.perso.mya.data.entity.CategoryProduct;	
	


public interface ICategoryProductDao {
	CategoryProduct findOne(Long idcategorie);
	
	List<CategoryProduct> findAllRootCategories();

	List<CategoryProduct> findAllRootCategoriesWithDaughters();
	

}
