package com.loydspharmacy.lloyds.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loydspharmacy.lloyds.model.Patient;
import com.loydspharmacy.lloyds.repository.PatientRepository;



@RestController
@RequestMapping("api/")

public class PatientController {
	
	@Autowired
	private PatientRepository patientRepository;
	
	@GetMapping("patient")
	public List<Patient> getUsers(){
		return this.patientRepository.findAll();
	}
	
	
	
}
