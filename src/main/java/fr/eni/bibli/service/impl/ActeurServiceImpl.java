package fr.eni.bibli.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.eni.bibli.entite.Acteur;
import fr.eni.bibli.service.ActeurService;
import fr.eni.bibli.service.dao.ActeurDao;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ActeurServiceImpl implements ActeurService {
	private ActeurDao acteurDao;

	@Override
	public List<Acteur> findAll() {
		List<Acteur> acteurs = acteurDao.findAll();
		acteurs.sort((Acteur o1, Acteur o2) -> o1.getNom().toUpperCase().compareTo(o2.getNom().toUpperCase()));
		return acteurs;
	}
}
