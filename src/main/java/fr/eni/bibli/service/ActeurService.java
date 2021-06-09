package fr.eni.bibli.service;

import java.util.List;

import fr.eni.bibli.entite.Acteur;

public interface ActeurService {

	/**
	 * Retourne la liste des acteurs
	 * 
	 * @return
	 */
	public List<Acteur> findAll();

}
