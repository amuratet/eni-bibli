package fr.eni.bibli.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.eni.bibli.entite.Film;
import fr.eni.bibli.service.FilmService;

@Controller
@RequestMapping
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

	@GetMapping("/")
	public String accueil() {
		return "accueil";
	}

	@GetMapping("/detail/{id}")
	public String detail(@PathVariable Integer id, Model model) {
		Film film = filmService.find(id);
		model.addAttribute("film", film);
		return "detail";
	}

	@GetMapping("/liste")
	public String liste(Model model) {
		List<Film> films = filmService.findAll();
		model.addAttribute("films", films);
		return "liste";
	}
	
	@GetMapping("/film/ajouter")
	public String ajouter(Model model) {
		Film film = new Film();
		model.addAttribute(film);
		return "ajouterFilm";
	}
	
	@PostMapping("/film/valider")
	public String valider(@ModelAttribute("film") Film film) {
		return "redirect:/liste";
	}

}
