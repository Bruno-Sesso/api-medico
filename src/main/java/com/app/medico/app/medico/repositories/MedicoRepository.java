package com.app.medico.app.medico.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.medico.app.medico.entities.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
	
}
