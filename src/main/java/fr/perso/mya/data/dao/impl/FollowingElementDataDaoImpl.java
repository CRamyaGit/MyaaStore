package fr.perso.mya.data.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import fr.perso.mya.data.dao.FollowingElementDataDao;
import fr.perso.mya.data.entity.Client;
import fr.perso.mya.data.entity.FollowingElementData;
import fr.perso.mya.data.entity.ISubscriber;
import fr.perso.mya.data.util.SubscriberType;

@Transactional
@Repository
public class FollowingElementDataDaoImpl implements FollowingElementDataDao{

	@PersistenceContext
	EntityManager em;

	@Override
	public List<FollowingElementData> getAllByUser(ISubscriber subscriber) {
		Long userId = 0L;
		if(subscriber.getType().equals(SubscriberType.CLIENT)) {
			Client client = (Client) subscriber;
			userId = client.getId();
		}
		return em.createNamedQuery("FollowingElementData.getAllCurrentByUser", FollowingElementData.class).setParameter("userId", userId).getResultList();
	}

	@Override
	public List<FollowingElementData> getAllByUserAndElementType(ISubscriber subscriber, String type) {
		Long userId = 0L;
		if(subscriber.getType().equals(SubscriberType.CLIENT)) {
			Client client = (Client) subscriber;
			userId = client.getId();
		}
		return em.createNamedQuery("FollowingElementData.getAllCurrentByUserAndElementType", FollowingElementData.class).setParameter("userId", userId).setParameter("type", type).getResultList();
	}

	@Override
	public FollowingElementData save(FollowingElementData fed) {
		if(fed.getId() == null) {
			em.persist(fed);
		}
		else {
			em.merge(fed);
		}
		return fed;
	}

	@Override
	public FollowingElementData getOne(Long id) {
		// TODO Auto-generated method stub
		return em.find(FollowingElementData.class, id);
	}

}
