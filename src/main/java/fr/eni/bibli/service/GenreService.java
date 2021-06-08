package fr.eni.bibli.service;

import java.util.List;

import fr.eni.bibli.entite.Genre;

public interface GenreService {

	/** Retour la liste des genres
	 * 
	 * @return
	 */
	public List<Genre> findAll();

}
