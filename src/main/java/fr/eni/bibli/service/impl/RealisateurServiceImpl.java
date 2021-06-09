package fr.eni.bibli.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.eni.bibli.entite.Realisateur;
import fr.eni.bibli.service.RealisateurService;
import fr.eni.bibli.service.dao.RealisateurDao;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class RealisateurServiceImpl implements RealisateurService {
	private RealisateurDao realisateurDao;

	@Override
	public List<Realisateur> findAll() {
		List<Realisateur> realisateurs = realisateurDao.findAll();
		realisateurs.sort((Realisateur o1, Realisateur o2) -> o1.getNom().toUpperCase().compareTo(o2.getNom().toUpperCase()));
		return realisateurs;
	}

}
