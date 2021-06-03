package fr.eni.bibli.service.impl;

import org.springframework.stereotype.Service;

import fr.eni.bibli.entite.Film;
import fr.eni.bibli.service.FilmService;
import fr.eni.bibli.service.dao.FilmDao;

@Service
public class FilmServiceImpl implements FilmService {

	
	// =======================================================
	// ATTRIBUTS
	// =======================================================
	private FilmDao filmDao;

	// =======================================================
	// CONSTRUCTEURS
	// =======================================================
	public FilmServiceImpl(FilmDao filmDao) {
		super();
		this.filmDao = filmDao;
	}

	// =======================================================
	// MÉTHODES PUBLIQUES
	// =======================================================

	public Film find(Integer idFilm) {
		return filmDao.findById(idFilm).get();
	}
}
