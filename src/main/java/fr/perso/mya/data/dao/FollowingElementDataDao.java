package fr.perso.mya.data.dao;

import java.util.List;

import fr.perso.mya.data.entity.FollowingElementData;
import fr.perso.mya.data.entity.ISubscriber;


public interface FollowingElementDataDao {
	
	FollowingElementData getOne(Long Id);
	
	List<FollowingElementData> getAllByUser(ISubscriber subscriber);
	
	List<FollowingElementData> getAllByUserAndElementType(ISubscriber subscriber, String type);
	
	FollowingElementData save(FollowingElementData fed);
}
