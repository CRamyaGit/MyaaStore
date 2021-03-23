package fr.perso.mya.data.dao;

import java.util.Date;
import java.util.List;

import fr.perso.mya.data.entity.BaseProduct;

public interface IRechercheProduits extends IGenericDao<BaseProduct> {
		public List<BaseProduct> rechercherProduitAvecReferenceId(Long id_Product);
		public List<BaseProduct> rechercherProduitAvecCriteres(
															Date rqDateCreation,
															Date rqDateRemove,
															Date rqLimitTimePromotion,
															Date rqLimitTimeTakePromotion,
															Long rqQuantityAvailable,
															Boolean rqIsCumulative,
															List<String> rqListTags);
		public List<BaseProduct> rechercherProduitSurMotsCles(List<String> keyWords);
}
