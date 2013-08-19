package fr.treeptik.centreformation.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "commande")
public class Commande implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer numeroCommande;

	@Temporal(TemporalType.DATE)
	private Date dateCommande;

	private Integer nbrPlacesCommandees;

	@OneToOne(mappedBy = "commande")
	private Facture facture;
	
    @ManyToOne() 
    @JoinColumn(name="codeSociete")
    private Societe societe;
    
    @ManyToOne() 
    @JoinColumn(name="numeroSession")
    private SESSION session;

	public Commande() {
		super();
	}

	public Commande(Integer numeroCommande, Date dateCommande,
			Integer nbrPlacesCommandees, Societe societe, SESSION session) {
		super();
		this.numeroCommande = numeroCommande;
		this.dateCommande = dateCommande;
		this.nbrPlacesCommandees = nbrPlacesCommandees;
		this.societe = societe;
		this.session = session;
	}

	public Integer getNumeroCommande() {
		return numeroCommande;
	}

	public void setNumeroCommande(Integer numeroCommande) {
		this.numeroCommande = numeroCommande;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public Integer getNbrPlacesCommandees() {
		return nbrPlacesCommandees;
	}

	public void setNbrPlacesCommandees(Integer nbrPlacesCommandees) {
		this.nbrPlacesCommandees = nbrPlacesCommandees;
	}

	public Facture getFacture() {
		return facture;
	}

	public void setFacture(Facture facture) {
		this.facture = facture;
	}

	public Societe getSociete() {
		return societe;
	}

	public void setSociete(Societe societe) {
		this.societe = societe;
	}

	public SESSION getSession() {
		return session;
	}

	public void setSession(SESSION session) {
		this.session = session;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
}
