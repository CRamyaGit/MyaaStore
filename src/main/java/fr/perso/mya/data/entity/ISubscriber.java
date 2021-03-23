package fr.perso.mya.data.entity;

/**
 * Interface to put on entity which can follow an IFollowableElement.
 * Methods specific to ISubscriber are put in ISubscriberService because of the difficulty of injecting a dao in an entity (can't manage to make aspect work). 
 * @author mya
 *
 */
public interface ISubscriber {
	String getType();
	
	Long getId();

}
