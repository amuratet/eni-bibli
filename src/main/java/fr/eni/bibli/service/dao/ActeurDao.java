package fr.eni.bibli.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.bibli.entite.Acteur;

public interface ActeurDao extends JpaRepository<Acteur, Integer> {

}
