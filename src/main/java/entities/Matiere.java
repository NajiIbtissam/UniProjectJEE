package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity

public class Matiere implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(unique = true)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_matiere;

    @Basic
    private long TP_matiere;

    @Basic
    private long CM_matiere;

    @Basic
    private long TD_matiere;

    @ManyToOne(targetEntity = UniteEnseignement.class)
    private UniteEnseignement uniteEn;

    @Basic
    private long ECTS_matiere;

    @Basic
    private String nom_matiere;

    @Basic
    private long total_matiere;

    public Matiere() {

    }

    public Long getId_matiere() {
        return this.id_matiere;
    }

    public void setId_matiere(Long id_matiere) {
        this.id_matiere = id_matiere;
    }

    public long getTP_matiere() {
        return this.TP_matiere;
    }

    public void setTP_matiere(long TP_matiere) {
        this.TP_matiere = TP_matiere;
    }

    public long getCM_matiere() {
        return this.CM_matiere;
    }

    public void setCM_matiere(long CM_matiere) {
        this.CM_matiere = CM_matiere;
    }

    public long getTD_matiere() {
        return this.TD_matiere;
    }

    public void setTD_matiere(long TD_matiere) {
        this.TD_matiere = TD_matiere;
    }

    public UniteEnseignement getUniteEn() {
        return this.uniteEn;
    }

    public void setUniteEn(UniteEnseignement UniteEn) {
        this.uniteEn = UniteEn;
    }

    public long getECTS_matiere() {
        return this.ECTS_matiere;
    }

    public void setECTS_matiere(long ECTS_matiere) {
        this.ECTS_matiere = ECTS_matiere;
    }

    public String getNom_matiere() {
        return this.nom_matiere;
    }

    public void setNom_matiere(String nom_matiere) {
        this.nom_matiere = nom_matiere;
    }

    public long getTotal_matiere() {
    	return this.total_matiere=TD_matiere+TP_matiere+CM_matiere;
    }

    public void setTotal_matiere(long total_matiere) {
        this.total_matiere = total_matiere;
    }
}

