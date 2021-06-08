package fr.eni.bibli.entite;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "FILM")
@Access(AccessType.FIELD)
public class Film implements Serializable {
	// =======================================================
	// CONSTANTES
	// =======================================================

	private static final long serialVersionUID = 1L;

	// =======================================================
	// ATTRIBUTS
	// =======================================================

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_film", nullable = false)
	private Integer id;

	@Column(name = "titre", nullable = false, length = 255)
	private String titre;

	@Column(name = "annee", nullable = false)
	private Integer annee;

	@Min(value = 1)
	@Column(name = "duree", nullable = false)
	private Integer duree;

	@Size(min = 20, max = 2500)
	@Column(name = "synopsis", nullable = false)
	private String synopsis;

	// @ManyToMany(fetch = FetchType.LAZY)

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_genre", referencedColumnName = "id_genre", nullable = false)
	private Genre genre;

}
