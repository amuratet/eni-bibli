package fr.eni.bibli.service;

import java.util.List;

import fr.eni.bibli.entite.Film;

public interface FilmService {
	/**
	 * Récupération d'un {@link Film} par son id
	 * 
	 * @param id
	 * @return
	 */
	public Film find(Integer id);

	/**
	 * Récupération de tous les {@link Film}
	 * 
	 * @return
	 */
	public List<Film> findAll();

	/**
	 * Ajout d'un film
	 * 
	 * @param Film
	 */
	public void ajouter(Film film);
}
