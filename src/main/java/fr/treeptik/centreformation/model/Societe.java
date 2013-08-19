package fr.treeptik.centreformation.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "societe")
public class Societe implements Serializable{

	private static final long serialVersionUID = 1L;
//	id
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer codeSociete;

	private String nomSocite;

	@OneToMany(mappedBy = "societe")
	List<Commande> commandes;

	public Societe() {
		super();
	}

	public Societe(Integer codeSociete, String nomSocite) {
		super();
		this.codeSociete = codeSociete;
		this.nomSocite = nomSocite;
	}

	public Integer getCodeSociete() {
		return codeSociete;
	}

	public void setCodeSociete(Integer codeSociete) {
		this.codeSociete = codeSociete;
	}

	public String getNomSocite() {
		return nomSocite;
	}

	public void setNomSocite(String nomSocite) {
		this.nomSocite = nomSocite;
	}

	public List<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}
	
	

}
