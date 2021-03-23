package fr.perso.mya.data.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import fr.perso.mya.data.dao.UserDao;
import fr.perso.mya.data.entity.User;

@Component
@Transactional
public class UserDaoImpl implements UserDao {
	
	@PersistenceContext
	EntityManager em;

	@Override
	public User findOneById(Long id) {
		// TODO Auto-generated method stub
		return em.find(User.class, id);
	}

	@Override
	public User findOneByLoginAndPassword(String login, String password) {
		// TODO Auto-generated method stub
		try {
			return em.createNamedQuery("User.findByLoginAndPassword", User.class).setParameter("login", login).setParameter("password", password).getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
		
	}

}
