package fr.perso.mya.data.dao;

import java.util.List;

import fr.perso.mya.data.entity.Promotion;

public interface IPromotionDao extends IGenericDao<Promotion> {
	List<Promotion> findAllValid();

	void createOne(Promotion promotion);
}
