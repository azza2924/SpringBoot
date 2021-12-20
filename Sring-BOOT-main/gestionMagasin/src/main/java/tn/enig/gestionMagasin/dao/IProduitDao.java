package tn.enig.gestionMagasin.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.enig.gestionMagasin.model.Produit;

@Repository
public interface IProduitDao extends JpaRepository<Produit, Integer> {
	

}
