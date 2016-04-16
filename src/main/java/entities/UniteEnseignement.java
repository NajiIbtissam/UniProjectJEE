package entities;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity

public class UniteEnseignement implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Basic
    private long ECTS_unite;

    @Basic
    private long CM_unite;

    @Column(unique = true)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_unite;

    @OneToMany(targetEntity = Matiere.class, mappedBy = "uniteEn")
    private List<Matiere> ListMatieres;

    @Basic
    private long total_unite;

    @Basic
    private long TD_unite;

    @Basic
    private long TP_unite;

    @Basic
    private String nom_unite;

    public UniteEnseignement() {

    }

    public long getECTS_unite() {
        return this.ECTS_unite;
    }

    public void setECTS_unite(long ECTS_unite) {
        this.ECTS_unite = ECTS_unite;
    }

    public long getCM_unite() {
        return this.CM_unite;
    }

    public void setCM_unite(long CM_unite) {
        this.CM_unite = CM_unite;
    }

    public Long getId_unite() {
        return this.id_unite;
    }

    public void setId_unite(Long id_unite) {
        this.id_unite = id_unite;
    }

    public List<Matiere> getListMatieres() {
        return this.ListMatieres;
    }

    public void setListMatieres(List<Matiere> ListMatieres) {
        this.ListMatieres = ListMatieres;
    }

    public long getTotal_unite() {
        return this.total_unite;
    }

    public void setTotal_unite(long total_unite) {
        this.total_unite = total_unite;
    }

    public long getTD_unite() {
        return this.TD_unite;
    }

    public void setTD_unite(long TD_unite) {
        this.TD_unite = TD_unite;
    }

    public long getTP_unite() {
        return this.TP_unite;
    }

    public void setTP_unite(long TP_unite) {
        this.TP_unite = TP_unite;
    }

    public String getNom_unite() {
        return this.nom_unite;
    }

    public void setNom_unite(String nom_unite) {
        this.nom_unite = nom_unite;
    }
}
