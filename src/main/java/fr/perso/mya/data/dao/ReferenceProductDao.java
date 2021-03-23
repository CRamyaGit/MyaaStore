package fr.perso.mya.data.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import fr.perso.mya.data.entity.ReferenceProduct;

@Transactional
@Component
public class ReferenceProductDao implements IReferenceProductDao{

		@PersistenceContext
		private EntityManager entityManager;

		@Override
		public ReferenceProduct findOne(Long id) {
			
			return entityManager.find(ReferenceProduct.class, id);
				
		}

		@Override
		public ReferenceProduct createOne(ReferenceProduct referenceProduct) {
			entityManager.persist(referenceProduct);
			return referenceProduct;
		}
		
	}



