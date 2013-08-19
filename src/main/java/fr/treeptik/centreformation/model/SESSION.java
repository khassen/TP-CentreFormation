package fr.treeptik.centreformation.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="session")
public class SESSION implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="numeroSession")
	private Integer numeroSession;
	
	@Temporal(TemporalType.DATE)
	private Date dateSession;
	
	private String heureDebut;
	private String heureFin;
	@OneToMany(mappedBy = "session")
	List<Commande> commandes;
	
    @ManyToOne() 
    @JoinColumn(name="codeSeminaire")
    private Seminaire seminaire;

	public SESSION() {
		super();
	}

	public SESSION(Integer numeroSession, Date dateSession, String heureDebut,
			String heureFin, List<Commande> commandes, Seminaire seminaire) {
		super();
		this.numeroSession = numeroSession;
		this.dateSession = dateSession;
		this.heureDebut = heureDebut;
		this.heureFin = heureFin;
		this.commandes = commandes;
		this.seminaire = seminaire;
	}

	public Integer getNumeroSession() {
		return numeroSession;
	}

	public void setNumeroSession(Integer numeroSession) {
		this.numeroSession = numeroSession;
	}

	public Date getDateSession() {
		return dateSession;
	}

	public void setDateSession(Date dateSession) {
		this.dateSession = dateSession;
	}

	public String getHeureDebut() {
		return heureDebut;
	}

	public void setHeureDebut(String heureDebut) {
		this.heureDebut = heureDebut;
	}

	public String getHeureFin() {
		return heureFin;
	}

	public void setHeureFin(String heureFin) {
		this.heureFin = heureFin;
	}

	public List<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}

	public Seminaire getSeminaire() {
		return seminaire;
	}

	public void setSeminaire(Seminaire seminaire) {
		this.seminaire = seminaire;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
