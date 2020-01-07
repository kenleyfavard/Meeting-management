package org.projetGL.init.Model;

import java.util.List;

import org.projetGL.init.Dao.HopitalRepository;
import org.projetGL.init.Dao.MedecinRepository;
import org.projetGL.init.Dao.PatientRepository;
import org.projetGL.init.Dao.PlageHoraireRepository;
import org.projetGL.init.Dao.RendezVousRepository;
import org.projetGL.init.Entites.Medecin;
import org.projetGL.init.Entites.Patient;
import org.projetGL.init.Metiers.IMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/index")
public class Controleur {
	
	@Autowired
	private IMetier objetCoucheMetier;
	@Autowired
	PatientRepository patientDao;
	
	@Autowired
	MedecinRepository medecinDao;
	
	@Autowired
	HopitalRepository hopitalDao;
	
	@Autowired
	PlageHoraireRepository plageHoraire;
	
	@Autowired
	RendezVousRepository rendezvousRepository;
	
	
	@RequestMapping(value="/tableauMedecin")
	public String tableauMedecin(Model model) {
			List<Medecin> medecinn= objetCoucheMetier.listMedecinhopital(1);
			
			model.addAttribute("medecins", medecinn);
			
		return "medecin";
	}
	
	@RequestMapping(value="/rendezVous")
	public String AffichageRendezVous(Model model) {
		
		List<Patient> listPatient = objetCoucheMetier.listPatienthopital(1);
		
		model.addAttribute("patient", listPatient);
		
		return "patient";
	}
	
}
