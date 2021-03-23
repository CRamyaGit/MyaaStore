package fr.perso.mya.data.dao;

import fr.perso.mya.data.entity.ReferenceProduct;


public interface IReferenceProductDao {
	
	ReferenceProduct findOne(Long idreferenceproduct);
	ReferenceProduct createOne(ReferenceProduct referenceproduct);
	




		
}
