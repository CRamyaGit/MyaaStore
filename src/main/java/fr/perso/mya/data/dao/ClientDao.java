package fr.perso.mya.data.dao;

import java.util.List;

import fr.perso.mya.data.entity.Client;
import fr.perso.mya.data.entity.IFollowableElement;

public interface ClientDao {
	List<Client> findAllFollowingFollowableElement(IFollowableElement element);
	public Client findOne(long  id);	
}
