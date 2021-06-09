package fr.eni.bibli.entite;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "acteur")
@Access(AccessType.FIELD)
public class Acteur implements Serializable {
	// =======================================================
	// CONSTANTES
	// =======================================================
	private static final long serialVersionUID = 1L;

	// =======================================================
	// ATTRIBUTS
	// =======================================================

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_acteur", nullable = false)
	private Integer id;

	@Column(name = "nom", nullable = false)
	private String nom;

	@Column(name = "prenom", nullable = false)
	private String prenom;

	@Column(name = "date_naissance", nullable = false)
	private LocalDate dateNaissance;

	// @Builder.Default
	// @ManyToMany(fetch = FetchType.EAGER)
	// @JoinTable(name = "FILM_ACTEUR",
	// joinColumns = {@JoinColumn(name = "id_acteur", referencedColumnName = "id_acteur")},
	// inverseJoinColumns = {@JoinColumn(name = "id_film", referencedColumnName = "id_film")})
	// private List<Film> films = new ArrayList<Film>();

	@ManyToMany(mappedBy = "acteurs")
	List<Film> films;
	// @JoinTable(name = "film_acteur",
	// joinColumns = @JoinColumn(name = "id acteur"),
	// inverseJoinColumns = @JoinColumn(name = "id_film"))
	// List<Film> films;
}
