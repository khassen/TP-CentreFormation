package fr.treeptik.centreformation.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "facture")
public class Facture implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer numeroFacture;

	@Temporal(TemporalType.DATE)
	private Date dateFacture;
	
	private Double monatntFacure;
	
	private Integer nbrPlaceFacture;
	
	@OneToOne(mappedBy="facture")
	@JoinColumn(name="numeroCommande")
	private Commande commande;

	public Facture() {
		super();
	}

	public Facture(Integer numeroFacture, Date dateFacture,
			Double monatntFacure, Integer nbrPlaceFacture, Commande commande) {
		super();
		this.numeroFacture = numeroFacture;
		this.dateFacture = dateFacture;
		this.monatntFacure = monatntFacure;
		this.nbrPlaceFacture = nbrPlaceFacture;
		this.commande = commande;
	}

	public Integer getNumeroFacture() {
		return numeroFacture;
	}

	public void setNumeroFacture(Integer numeroFacture) {
		this.numeroFacture = numeroFacture;
	}

	public Date getDateFacture() {
		return dateFacture;
	}

	public void setDateFacture(Date dateFacture) {
		this.dateFacture = dateFacture;
	}

	public Double getMonatntFacure() {
		return monatntFacure;
	}

	public void setMonatntFacure(Double monatntFacure) {
		this.monatntFacure = monatntFacure;
	}

	public Integer getNbrPlaceFacture() {
		return nbrPlaceFacture;
	}

	public void setNbrPlaceFacture(Integer nbrPlaceFacture) {
		this.nbrPlaceFacture = nbrPlaceFacture;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
