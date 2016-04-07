package entities;
import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class UniteEnseignement implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	@Column(unique = true)
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_unite;
	@Basic
	private String nom_unite;
	@Basic
	private int total_unite;
	@Basic
	private int CM_unite;
	@Basic
	private int TD_unite;
	@Basic
	private int TP_unite;
	@Basic
	private int ECTS_unite;
	
	public UniteEnseignement(String nom_unite, int total_unite, int cM_unite, int tD_unite, int tP_unite,
			int eCTS_unite) {
		
		this.nom_unite = nom_unite;
		this.total_unite = total_unite;
		CM_unite = cM_unite;
		TD_unite = tD_unite;
		TP_unite = tP_unite;
		ECTS_unite = eCTS_unite;
	}

	public int getId_unite() {
		return id_unite;
	}

	public void setId_unite(int id_unite) {
		this.id_unite = id_unite;
	}

	public String getNom_unite() {
		return nom_unite;
	}

	public void setNom_unite(String nom_unite) {
		this.nom_unite = nom_unite;
	}

	public int getTotal_unite() {
		return total_unite;
	}

	public void setTotal_unite(int total_unite) {
		this.total_unite = total_unite;
	}

	public int getCM_unite() {
		return CM_unite;
	}

	public void setCM_unite(int cM_unite) {
		CM_unite = cM_unite;
	}

	public int getTD_unite() {
		return TD_unite;
	}

	public void setTD_unite(int tD_unite) {
		TD_unite = tD_unite;
	}

	public int getTP_unite() {
		return TP_unite;
	}

	public void setTP_unite(int tP_unite) {
		TP_unite = tP_unite;
	}

	public int getECTS_unite() {
		return ECTS_unite;
	}

	public void setECTS_unite(int eCTS_unite) {
		ECTS_unite = eCTS_unite;
	}
	
	
}

