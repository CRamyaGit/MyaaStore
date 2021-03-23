package fr.perso.mya.data.dao;

import java.util.List;

import fr.perso.mya.data.entity.Client;
import fr.perso.mya.data.entity.Reservation;

public interface IReservationDao {
	Reservation findOne(Long idUnite);
	Reservation createOne(Reservation reservation);
	List<Reservation> findAll();
	List<Reservation> findAllByClient(Client client);
}
