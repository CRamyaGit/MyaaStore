package fr.perso.mya.data.entity;

/**
 * Interface to put on entity which are followable by an ISuscriber.
 * Methods specific to IFOllowable are put in IFollowableElementService because of the difficulty of injecting a dao in an entity (can't manage to make aspect work). 
 * @author mya
 *
 */
public interface IFollowableElement {
	String getType();
	
	Long getId();
}
