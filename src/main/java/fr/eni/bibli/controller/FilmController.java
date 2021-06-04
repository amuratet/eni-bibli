package fr.eni.bibli.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import fr.eni.bibli.entite.Film;
import fr.eni.bibli.service.FilmService;

@Controller
@RequestMapping("/")
public class FilmController {

	// =======================================================
	// ATTRIBUTS
	// =======================================================

	private final FilmService filmService;

	// =======================================================
	// CONSTRUCTEURS
	// =======================================================

	public FilmController(FilmService filmService) {
		super();
		this.filmService = filmService;
	}

	// =======================================================
	// MÉTHODES PUBLIQUES
	// =======================================================

	@GetMapping
	public String accueil() {
		return "accueil";
	}

	@GetMapping("detail")
	public String detail(Integer id) {
		return "detail";
	}

	@GetMapping("liste")
	public String liste(Model model) {
		List<Film> films = filmService.findAll();
		model.addAttribute("films", films);
		return "liste";
	}

}
