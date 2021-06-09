package fr.eni.bibli.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.eni.bibli.entite.Film;
import fr.eni.bibli.entite.Genre;
import fr.eni.bibli.entite.Realisateur;
import fr.eni.bibli.service.FilmService;
import fr.eni.bibli.service.GenreService;
import fr.eni.bibli.service.RealisateurService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Controller
@RequestMapping
public class FilmController {

	// =======================================================
	// ATTRIBUTS
	// =======================================================

	private final FilmService filmService;
	private final GenreService genreService;
	private final RealisateurService realisateurService;

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
		List<Genre> genres = genreService.findAll();
		List<Realisateur> realisateurs = realisateurService.findAll();
		model.addAttribute("fieldDisabled", "disabled"); /*Non selectionnable*/
		model.addAttribute("selected", "selected"); 
		model.addAttribute("empty", ""); 
		model.addAttribute(film);
		model.addAttribute("genres", genres);
		model.addAttribute("realisateurs", realisateurs);
		return "ajouterFilm";
	}

	@PostMapping("/film/valider")
	public String valider(@Valid @ModelAttribute("film") Film film, BindingResult result) {
		if (result.hasErrors()) {
			return "ajouterFilm";
		}
		filmService.ajouter(film);
		return "redirect:/liste";
	}

}
