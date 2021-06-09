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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import fr.eni.bibli.entite.Acteur;
import fr.eni.bibli.entite.Film;
import fr.eni.bibli.entite.Genre;
import fr.eni.bibli.entite.Realisateur;
import fr.eni.bibli.service.ActeurService;
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
	private final ActeurService acteurService;

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
		List<Acteur> acteurs = acteurService.findAll();
		model.addAttribute(film);
		model.addAttribute("genres", genres);
		model.addAttribute("realisateurs", realisateurs);
		model.addAttribute("acteurs", acteurs);
		return "ajouterFilm";
	}

	@PostMapping("/film/valider")
	public String valider(@Valid @ModelAttribute("film") Film film, BindingResult result, RedirectAttributes redirAttrs) {
		if (result.hasErrors()) {
			redirAttrs.addFlashAttribute("error", "The error XYZ occurred.");
			return "ajouterFilm";
		}
		filmService.ajouter(film);
		redirAttrs.addFlashAttribute("success", "Everything went just fine.");
		return "redirect:/liste";
	}

}
