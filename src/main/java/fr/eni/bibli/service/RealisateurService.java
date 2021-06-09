package fr.eni.bibli.service;

import java.util.List;

import fr.eni.bibli.entite.Realisateur;

public interface RealisateurService {

	/**
	 * Retour la liste des film du réalisateur
	 * 
	 * @return
	 */
	public List<Realisateur> findAll();
}
