package fr.perso.mya.data.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import fr.perso.mya.data.entity.Client;
import fr.perso.mya.data.entity.Reservation;

@Transactional
@Component
public class ReservationDao implements IReservationDao {

	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public Reservation findOne(Long idUnite) {
		return entityManager.find(Reservation.class, idUnite);
	}
	

	@Override
	public Reservation createOne(Reservation reservation) {
		entityManager.persist(reservation);
		return reservation;
		
	
	}


	@Override
	public List<Reservation> findAll() {
		
		return  entityManager.createNamedQuery("Reservation.findAll",Reservation.class).getResultList();
	}


	@Override
	public List<Reservation> findAllByClient(Client client) {
		// TODO Auto-generated method stub
		return entityManager.createNamedQuery("Reservation.findAllByClient",Reservation.class).setParameter("clientId", client.getId()).getResultList();
	}

}
