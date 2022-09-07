package com.loydspharmacy.lloyds.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loydspharmacy.lloyds.model.*;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long> {
	
	
	

}
