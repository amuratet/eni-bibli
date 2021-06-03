package fr.eni.bibli.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.bibli.entite.Film;

public interface FilmDao extends JpaRepository<Film, Integer> {
	
}
