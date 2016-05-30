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
    private Long id;

    @Basic
    private long tp;

    @Basic
    private long cm;

    @Basic
    private long td;

    @ManyToOne(targetEntity = UniteEnseignement.class)
    private UniteEnseignement uniteEn;

    @Basic
    private long ects;

    @Basic
    private String nom;

    @Basic
    private long total;

    public Matiere() {

    }

    public Long getid() {
        return this.id;
    }

    public void setid(Long id) {
        this.id = id;
    }

    public long gettp() {
        return this.tp;
    }

    public void settp(long tp) {
        this.tp = tp;
    }

    public long getcm() {
        return this.cm;
    }

    public void setcm(long cm) {
        this.cm = cm;
    }

    public long gettd() {
        return this.td;
    }

    public void settd(long td) {
        this.td = td;
    }

    public UniteEnseignement getUniteEn() {
        return this.uniteEn;
    }

    public void setUniteEn(UniteEnseignement UniteEn) {
        this.uniteEn = UniteEn;
    }

    public long getects() {
        return this.ects;
    }

    public void setects(long ects) {
        this.ects = ects;
    }

    public String getnom() {
        return this.nom;
    }

    public void setnom(String nom) {
        this.nom = nom;
    }

    public long gettotal() {
    	return this.total=td+tp+cm;
    }

    public void settotal(long total) {
        this.total = total;
    }
}

