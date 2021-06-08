package fr.eni.bibli.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.bibli.entite.Genre;

public interface GenreDao extends JpaRepository<Genre, Integer> {

}
