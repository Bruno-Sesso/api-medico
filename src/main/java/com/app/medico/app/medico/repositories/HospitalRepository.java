package com.app.medico.app.medico.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.medico.app.medico.entities.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital, Long> {
	
}
