package org.projetGL.init.Entites;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Patient implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idPatient;
	private String codePatient;
	
	private String nomPatient;
	private String prenomPatient;
	private String adressePatient;
	private long telefonePatient;
	private String emailPatient;
	private Date dateEnregistrement;
	
	
	@ManyToOne
	@JoinColumn(name="NOM_HOPITAL")
	private Hopital hopitalPatient;
	
	// maintenant nous allons gérer les relations les différentes classes qui ont été créer
	
	// un patient a droit  une reservation

	@OneToOne(mappedBy="patientRdv")
	private RendezVous reservation;
	
//	//pour chaque reservation de notre patient nous avons droit de l'affecter un medecin
	
	@ManyToOne
	@JoinColumn(name="CODE_MEDECIN")
	private Medecin medecinAffecter;
	

	
	public Medecin getMedecinAffecter() {
		return medecinAffecter;
	}
	public void setMedecinAffecter(Medecin medecinAffecter) {
		this.medecinAffecter = medecinAffecter;
	}
	public String getEmailPatient() {
		return emailPatient;
	}
	public void setEmailPatient(String emailPatient) {
		this.emailPatient = emailPatient;
	}
	public RendezVous getReservation() {
		return reservation;
	}
	public void setReservation(RendezVous reservation) {
		this.reservation = reservation;
	}

	public Hopital getHopitalPatient() {
		return hopitalPatient;
	}
	public void setHopitalPatient(Hopital hopitalPatient) {
		this.hopitalPatient = hopitalPatient;
	}
	public long getIdPatient() {
		return idPatient;
	}
	public void setIdPatient(long idPatient) {
		this.idPatient = idPatient;
	}
	public String getCodePatient() {
		return codePatient;
	}
	public void setCodePatient(String codePatient) {
		this.codePatient = codePatient;
	}
	public String getNomPatient() {
		return nomPatient;
	}
	public void setNomPatient(String nomPatient) {
		this.nomPatient = nomPatient;
	}
	public String getPrenomPatient() {
		return prenomPatient;
	}
	public void setPrenomPatient(String prenomPatient) {
		this.prenomPatient = prenomPatient;
	}
	public String getAdressePatient() {
		return adressePatient;
	}
	public void setAdressePatient(String adresseMenbre) {
		this.adressePatient = adresseMenbre;
	}
	public long getTelefonePatient() {
		return telefonePatient;
	}
	public void setTelefonePatient(long telefoneMenbre) {
		this.telefonePatient = telefoneMenbre;
	}
	public String getEmailMenbre() {
		return emailPatient;
	}
	public void setEmailMenbre(String emailMenbre) {
		this.emailPatient = emailMenbre;
	}
	public Date getDateEnregistrement() {
		return dateEnregistrement;
	}
	public void setDateEnregistrement(Date dateEnregistrement) {
		this.dateEnregistrement = dateEnregistrement;
	}

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
	public Patient(String nomPatient, String prenomPatient, String adresseMenbre, long telefoneMenbre,
			String emailMenbre) {
		super();
		this.nomPatient = nomPatient;
		this.prenomPatient = prenomPatient;
		this.adressePatient = adresseMenbre;
		this.telefonePatient = telefoneMenbre;
		this.emailPatient = emailMenbre;
	}
	
	
	
	
	
//	@OneToMany(mappedBy="menbre",fetch=FetchType.LAZY)
//	private Collection<Medecin> listMedecins;

}
