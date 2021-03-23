package fr.perso.mya.data.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import fr.perso.mya.data.dao.IPublishDao;
import fr.perso.mya.data.entity.Publish;

@Component
@Transactional
public class PublishDao implements IPublishDao{

	@PersistenceContext
	private EntityManager em;
	@Override
	public Publish save(Publish publish) {
		em.persist(publish);
		return publish;
	}

}
