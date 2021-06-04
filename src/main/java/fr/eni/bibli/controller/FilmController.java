package fr.eni.bibli.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
	@ResponseBody
	public String accueil() {
		return "accueil.html";
	}

	@GetMapping("detail")
	@ResponseBody
	public String detail(Integer id) {
		return "detail.html";
	}

	@GetMapping("liste")
	@ResponseBody
	public String liste(Model model) {
		List<Film> films = filmService.findAll();
		model.addAttribute("films", films);
		return "liste.html";
	}

}
