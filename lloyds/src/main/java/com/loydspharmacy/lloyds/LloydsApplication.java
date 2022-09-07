package com.loydspharmacy.lloyds;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.loydspharmacy.lloyds.model.Patient;
import com.loydspharmacy.lloyds.repository.PatientRepository;

@SpringBootApplication
public class LloydsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LloydsApplication.class, args);
	}
	
	@Autowired
	private PatientRepository patientRepository;

	@Override
	public void run(String... args) throws Exception {
		this.patientRepository.save(new Patient("Ramesh", "Fadatare", "ramesh@gmail.com"));
		this.patientRepository.save(new Patient("Ramesh", "Fadatare", "ramesh@gmail.com"));
		this.patientRepository.save(new Patient("Ramesh", "Fadatare", "ramesh@gmail.com"));

		
	}

}
