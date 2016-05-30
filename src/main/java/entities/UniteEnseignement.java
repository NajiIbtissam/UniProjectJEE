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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity

public class UniteEnseignement implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Basic
    private long ects;

    @Basic
    private long cm;

    @Column(unique = true)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(targetEntity = Matiere.class, mappedBy = "uniteEn",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    @Fetch(value = FetchMode.SUBSELECT)
    private List<Matiere> ListMatieres;
    
    @ManyToOne(targetEntity = Formation.class)
    private Formation formation;

    @Basic
    private long total;

    @Basic
    private long td;

    @Basic
    private long tp;

    @Basic
    private String nom;

    public UniteEnseignement() {

    }

    public long getects() {
        return this.ects;
    }

    public void setects(long ects) {
        this.ects = ects;
    }

    public long getcm() {
        return this.cm;
    }

    public void setcm(long cm) {
        this.cm = cm;
    }

    public Long getid() {
        return this.id;
    }

    public void setid(Long id) {
        this.id = id;
    }

    public List<Matiere> getListMatieres() {
        return this.ListMatieres;
    }

    public void setListMatieres(List<Matiere> ListMatieres) {
        this.ListMatieres = ListMatieres;
    }

    public long gettotal() {
    	return td+tp+cm;
    }

    public void settotal(long total) {
        this.total = total;
    }

    public long gettd() {
        return this.td;
    }

    public void settd(long td) {
        this.td = td;
    }

    public long gettp() {
        return this.tp;
    }

    public void settp(long tp) {
        this.tp = tp;
    }

    public String getnom() {
        return this.nom;
    }

    public void setnom(String nom) {
        this.nom = nom;
    }
    
    public Formation getFormation() {
        return this.formation;
    }

    public void setFormation(Formation formation) {
        this.formation = formation;
    }
}
