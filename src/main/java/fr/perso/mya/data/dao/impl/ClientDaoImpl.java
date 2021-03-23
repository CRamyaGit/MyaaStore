package fr.perso.mya.data.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import fr.perso.mya.data.dao.ClientDao;
import fr.perso.mya.data.entity.Client;
import fr.perso.mya.data.entity.IFollowableElement;

@Component
@Transactional
public class ClientDaoImpl implements ClientDao{

	@PersistenceContext
	EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Client> findAllFollowingFollowableElement(IFollowableElement element) {
		
		Query query = em.createNamedQuery("Client.findAllFollowingFollowableElement", Client.class)
						.setParameter("elementId", element.getId())
						.setParameter("elementType", element.getType());
		
		return query.getResultList();
	}

	@Override
	public Client findOne(long id) {
		
		return em.find(Client.class, id);
	}

}
