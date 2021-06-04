package fr.eni.bibli.entite;

import java.io.Serializable;
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
@Table(name = "genre")
@Access(AccessType.FIELD)
public class Genre implements Serializable {
	// =======================================================
	// CONSTANTES
	// =======================================================
	private static final long serialVersionUID = 1L;

	// =======================================================
	// ATTRIBUTS
	// =======================================================

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_genre", nullable = false)
	private Integer id;
	
	@Column(name = "libelle", nullable = false)
	private String libelle;

//	@Builder.Default
//	@OneToMany(mappedBy = "film", fetch = FetchType.LAZY)
//	private List<Film> films = new ArrayList<Film>();

}
