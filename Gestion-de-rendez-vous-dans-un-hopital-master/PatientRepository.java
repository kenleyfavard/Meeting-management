package org.projetGL.init.Dao;

import org.projetGL.init.Entites.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long>{

}
