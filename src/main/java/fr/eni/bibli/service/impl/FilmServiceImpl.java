package fr.eni.bibli.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.eni.bibli.entite.Film;
import fr.eni.bibli.service.FilmService;
import fr.eni.bibli.service.dao.FilmDao;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class FilmServiceImpl implements FilmService {

	// =======================================================
	// ATTRIBUTS
	// =======================================================
	private FilmDao filmDao;

	// =======================================================
	// MÉTHODES PUBLIQUES
	// =======================================================

	@Override
	public Film find(Integer id) {
		return filmDao.findById(id).get();
	}

	@Override
	public List<Film> findAll() {
		return filmDao.findAll();
	}

	@Override
	public void ajouter(Film film) {
		filmDao.save(film);
	}

}
