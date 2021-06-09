package fr.eni.bibli.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.eni.bibli.entite.Genre;
import fr.eni.bibli.service.GenreService;
import fr.eni.bibli.service.dao.GenreDao;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class GenreServiceImpl implements GenreService {

	private GenreDao genreDao;

	@Override
	public List<Genre> findAll() {
		List<Genre> genres = genreDao.findAll();
		genres.sort((Genre o1, Genre o2) -> o1.getLibelle().toUpperCase().compareTo(o2.getLibelle().toUpperCase()));
		return genres;
	}

}
