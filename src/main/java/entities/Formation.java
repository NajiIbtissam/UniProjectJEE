package entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity

public class Formation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(unique = true)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Basic
	private String nom;

	@OneToMany(targetEntity = UniteEnseignement.class, mappedBy = "formation", cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<UniteEnseignement> unites;

	public Long getid() {
		return this.id;
	}

	public void setid(Long id) {
		this.id = id;
	}

	public String getnom() {
		return this.nom;
	}

	public void setnom(String nom) {
		this.nom = nom;
	}

	public List<UniteEnseignement> getUnites() {
		return this.unites;
	}

	public void setListUnites(List<UniteEnseignement> unites) {
		this.unites = unites;
	}
}
