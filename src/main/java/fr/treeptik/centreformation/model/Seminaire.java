package fr.treeptik.centreformation.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="seminaire")
public class Seminaire implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="numeroSeminaire")
	private Integer codeSeminaire;
	
	private Double prixSeminaire;
	
	private Integer dureeSeminaire;
	
	private String niveauSeminaire;
	
	private Integer nbrPlacesSeminaire;
	
	@OneToMany(mappedBy = "seminaire")
	List<SESSION> sessions;

	public Seminaire() {
		super();
	}

	public Seminaire(Integer codeSeminaire, Double prixSeminaire,
			Integer dureeSeminaire, String niveauSeminaire,
			Integer nbrPlacesSeminaire) {
		super();
		this.codeSeminaire = codeSeminaire;
		this.prixSeminaire = prixSeminaire;
		this.dureeSeminaire = dureeSeminaire;
		this.niveauSeminaire = niveauSeminaire;
		this.nbrPlacesSeminaire = nbrPlacesSeminaire;
	}

	public Integer getCodeSeminaire() {
		return codeSeminaire;
	}

	public void setCodeSeminaire(Integer codeSeminaire) {
		this.codeSeminaire = codeSeminaire;
	}

	public Double getPrixSeminaire() {
		return prixSeminaire;
	}

	public void setPrixSeminaire(Double prixSeminaire) {
		this.prixSeminaire = prixSeminaire;
	}

	public Integer getDureeSeminaire() {
		return dureeSeminaire;
	}

	public void setDureeSeminaire(Integer dureeSeminaire) {
		this.dureeSeminaire = dureeSeminaire;
	}

	public String getNiveauSeminaire() {
		return niveauSeminaire;
	}

	public void setNiveauSeminaire(String niveauSeminaire) {
		this.niveauSeminaire = niveauSeminaire;
	}

	public Integer getNbrPlacesSeminaire() {
		return nbrPlacesSeminaire;
	}

	public void setNbrPlacesSeminaire(Integer nbrPlacesSeminaire) {
		this.nbrPlacesSeminaire = nbrPlacesSeminaire;
	}

	public List<SESSION> getSessions() {
		return sessions;
	}

	public void setSessions(List<SESSION> sessions) {
		this.sessions = sessions;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
