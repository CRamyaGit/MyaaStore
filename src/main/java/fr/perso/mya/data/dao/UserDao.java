package fr.perso.mya.data.dao;

import fr.perso.mya.data.entity.User;

public interface UserDao {
	User findOneById(Long id);
	
	User findOneByLoginAndPassword(String login, String password);
}
