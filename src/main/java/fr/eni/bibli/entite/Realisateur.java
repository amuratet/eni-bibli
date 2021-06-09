package fr.eni.bibli.entite;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
@Table(name = "realisateur")
@Access(AccessType.FIELD)
public class Realisateur implements Serializable {
	// =======================================================
	// CONSTANTES
	// =======================================================
	private static final long serialVersionUID = 1L;

	// =======================================================
	// ATTRIBUTS
	// =======================================================

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_realisateur", nullable = false)
	private Integer id;

	@Column(name = "nom", nullable = false)
	private String nom;

	@Column(name = "prenom", nullable = false)
	private String prenom;

	@Column(name = "date_naissance", nullable = false)
	private LocalDate dateNaissance;

//	@Builder.Default
//	@OneToMany(mappedBy = "realisateur", fetch = FetchType.LAZY)
//	private List<Film> films = new ArrayList<Film>();

}
